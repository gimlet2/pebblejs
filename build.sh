#!/bin/sh
mkdir -p build/kotlin
kotlinc-js -output build/kotlin/app.js -module-kind commonjs -meta-info src/kotlin/*
kotlin-dce-js -output-dir src/js src/kotlinjs/kotlin.js build/kotlin/app.js
pebble build