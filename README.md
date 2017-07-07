# Overview
This project is an experiment to see how easily one can create a read-only REST API against a MongoDB store.
The idea is that an internal service populates specific documents in the database that are intended only for
REST API callers.  The APIs are read-only and meant to be cache-friendly.

# Prerequisites
* a working [Docker](http://docker.io) engine
* a working [Java 8](http://java.sun.com) installation

# Building
Type `./build.sh` to build the image.

# Installation
Docker will automatically install the newly built image into the cache.

# Tips and Tricks

## Launching The Image

`./run-container.sh` will launch the image with default values.  The script takes various arguments that control the
application's behavior.  Examine the script to see the current list of arguments.

# Troubleshooting

# License and Credits
This project is licensed under the [Apache License Version 2.0, January 2004](http://www.apache.org/licenses/).

# List of Changes
