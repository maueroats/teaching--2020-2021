module ConnectFour where

-- This simplified module only works with a 1x1 board.
-- You should replace the code with your own.
    
type Board = [[Int]]

drawBoard :: Board -> String
drawBoard board = show $ simplify board

is_won :: Board -> Bool
is_won board = False

is_move_legal :: Board -> Int -> Bool
is_move_legal board col = (col == 0)

make_move :: Board -> Int -> Int -> Board
make_move board col player = [[player]]

-- Just for the demo: force the board to be 1x1.
simplify board = [[board!!0!!0]]

