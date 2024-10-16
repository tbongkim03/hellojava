#!/bin/bash

# Start the application
nohup java \
	-jar build/lib/hellojava-0.0.1-SNAPSHOT.jar &

echo "> Application started with PID $!"
