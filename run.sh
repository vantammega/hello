#! /bin/bash

pid_file=service.pid

if [ -f $pid_file ]; then
	read pid <$pid_file	
	kill $pid
	while [ 1 ]
	do
		if ps -p $pid | grep $pid > /dev/null
		then
			sleep 1
		else
			break
		fi
	done
	
fi

java -jar hello.jar & echo $! > $pid_file &
