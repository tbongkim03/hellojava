#!/bin/bash

# down & up
docker compose down; docker compose up -d --force-recreate --build
