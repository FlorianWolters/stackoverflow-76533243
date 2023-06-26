#!/usr/bin/env bash

clear

script_dir=$(cd "$(dirname "$0")"; pwd)

mvn --file "${script_dir}/company/pom/parent/pom.xml" install
