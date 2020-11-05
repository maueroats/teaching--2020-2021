---
title: "Mancala UI"
date: 2020-10-24T20:00:17-05:00
weight: 50
draft: false
#type: slide
#theme: white
description: "Code provided to run the human-computer interaction in mancala."
---

```haskell
main = do print "Mancala"
          event_loop standardBoard 0 0 0

type Player = Int
type Board = [Int]
type Square = Int

standardBoard :: Board
standardBoard = fours ++ [0] ++ fours ++ [0]
  where fours = replicate 6 4

end_game board = putStrLn $ "WINNER: Player "++show (winner board)

dispatch_action_1 :: Board -> Player -> Square -> IO()
dispatch_action_1 board player square 
  | is_game_over board    = end_game board
  | otherwise             = pick_and_play board player square

dispatch_action_2 :: Board -> Player -> Square -> IO()
dispatch_action_2 board player (-1) =
   do putStrLn "GAME QUIT"
      return ()

dispatch_action_2 board player square = 
  do
    let new_stones = get1k board square
        new_board = zero1k board square
        new_square' = square_next player square
    event_loop new_board player new_square' new_stones

pick_and_play board player square = do
  putStrLn "What location do you want to pick up? "
  new_square <- ask_pickup_location board player
  dispatch_action_2 board player new_square

event_loop :: Board -> Player -> Square -> Int -> IO()
event_loop board player square 0 = do
  mapM_ putStrLn $ drawBoard board
  putStrLn $ status_line board player square 0
  dispatch_action_1 board player square
  
event_loop board player square stones = do
  putStrLn $ status_line board player square stones
  putStrLn "Hit enter to make this play."
  ask_hit_enter
  let (new_board, new_player, new_square, new_stones, message) =
        distribute board player square stones
  putStrLn message
  event_loop new_board new_player new_square new_stones

status_line :: Board -> Player -> Square -> Int -> String
status_line board player square stones =
  "[player "++(show player)++"] stones in hand: "++(show stones)++(more_info square stones)
  where more_info _ 0 = ""
        more_info sq _ = "\nready to play in location "++(show sq)

get_number :: String -> Int
get_number str
    = case (reads str)::[((Int),String)] of
        [(num, "")] -> num
        _           -> (-2)

get_move_raw :: IO Int
get_move_raw = do
  x <- getLine
  if (length x == 0) then
    get_move_raw
  else
    return (get_number x)

ask_pickup_location :: Board -> Player -> IO Int
ask_pickup_location board player = do
  n <- get_move_raw
  if is_legal_move board player n || n == -1 then
    return n
  else do
    putStrLn "Illegal move"
    ask_pickup_location board player

ask_hit_enter = do
  _ <- getLine
  return ()
```

Functions you need to define. Lines include values that will let the
program run (although incorrectly).

```
is_game_over :: Board -> Bool
is_game_over board = undefined -- False -- and it will run

winner :: Board -> Player
winner board = undefined -- 0 -- and it will run

is_legal_move :: Board -> Player -> Square -> Bool
is_legal_move board player n = undefined -- True -- and it will run

drawBoard :: Board -> [String]
drawBoard board = undefined  -- ["Broken"] -- and it will run

square_next :: Player -> Square -> Square
square_next player sq = undefined -- sq -- will run broken

distribute :: Board -> Player -> Square -> Int -> 
    (Board, Player, Square, Int, String)
distribute board player sq n = undefined    

-- FIXME UTILITY FUNCTIONS
get1k :: Board -> Square -> Int
get1k board square = undefined -- 0 -- if you want it to run broken
zero1k :: Board -> Square -> Board
zero1k board sq = undefined -- board -- if you want it to run broken
add1k :: Board -> Square -> Int -> Board
add1k board square stones = undefined -- board -- if you want it to run
```
