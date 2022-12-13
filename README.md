A minimal reproduction of a hang when calling close on a returned input-stream.

It makes a difference what url is used. I was able to reproduce a consistent hang with `"https://github.com/uscensusbureau/citysdk/archive/bc93425d47508741c8fa8131ac09a53372e1e088.zip"`.

## Usage

Either call the -main function in the `repro` namespace or execute from the command line:

```sh
clojure -M -m repro
```

Note that the function will never return and it will hang forever.
