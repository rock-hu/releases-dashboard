# mkdocs

## commands

```
mkdocs  --help
Usage: mkdocs [OPTIONS] COMMAND [ARGS]...

  MkDocs - Project documentation with Markdown.

Options:
  -V, --version  Show the version and exit.
  -q, --quiet    Silence warnings
  -v, --verbose  Enable verbose output
  -h, --help     Show this message and exit.

Commands:
  `build `     Build the MkDocs documentation
  `gh-deploy`  Deploy your documentation to GitHub Pages
  `new`        Create a new MkDocs project
  `serve`      Run the builtin development server
```

## install pip requirements.txt

```bash
pip install -r requirements.txt
```

## mkdocs build

```bash
mkdocs build
```

## mkdocs serve

```bash
mkdocs serve --dev-addr localhost:8090
```

## mkdocs gh-deploy

```bash
mkdocs gh-deploy
```

