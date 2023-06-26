#!/usr/bin/env bash

clear

script_dir=$(cd "$(dirname "$0")"; pwd)

rm -rf "$TMP/.mvn/site/io.github.florianwolters"

time mvn --file "${script_dir}/aggregator/pom.xml" clean verify site-deploy
