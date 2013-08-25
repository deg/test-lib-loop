# test-lib-loop

Simple reproducible test case showing problem with `:libs [""]` in `:cljsbuild`.

The use of `:libs [""]` is mandated by the [pprng
library](https://github.com/cemerick/pprng/) but exhibits the
following problem:

When two (or more?) builds are specified to :cljsbuild, then `lein
cljsbuild auto` loops forever, building first one then the other.

To demonstrate, do `lein do clean, cljsbuild clean, cljsbuild auto` in this project.

Remove the `:libs [""]` lines from `project.clj`, and the problem goes away.
