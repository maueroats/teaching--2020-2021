#! /bin/bash
base_dir=$www
if [ -z "$base_dir" ]; then echo "$0: must set base_dir!" 1>&2 ; exit 1 ; fi

echo "WORKING: ${base_dir}"
cd "$base_dir"
hugo --cleanDestinationDir
git add -A
git commit -a -m "wy-cs site update $(date +'%Y-%m-%d %H:%M')"
git push -u origin master
#git push -u backdoor master
