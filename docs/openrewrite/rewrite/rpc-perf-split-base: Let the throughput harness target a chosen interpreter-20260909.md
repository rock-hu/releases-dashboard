# rpc-perf-split-base: Let the throughput harness target a chosen interpreter

## release on 20260909
## description
## changes
The harness spawns whichever interpreter PythonRewriteRpc resolves on its  

own, so comparing two CPython releases meant moving the project venv aside.  

REWRITE_PY_EXE names one instead.

The path is echoed because a test JVM that did not inherit the variable would  

otherwise look exactly like a run where both arms used the same interpreter.

