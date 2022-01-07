# LLULL COMPILER 

> Compiler for a new programming language **Llull**. This language will have the extension *.llull*.

**NOTE** 
Compilation and execution are in macOS syntax. 

## Before Compiling
Make sure to install requirements: python -m pip install -r requirements.txt 

## Compiling
antlr4 -Dlanguage=Python3 -no-listener -visitor llull.g4

## Executing Interpret
Using test file test-exemple.llull

### With main 
python3 llull.py test-exemple.llull
                 
### Without main
python3 llull.py test-exemple-pretty.llull hanoi 3 1 2 3

## Executing Pretty Printer
python3 llull.py test-exemple-pretty.llull

## Available Tests
* test-doubleAssig.llull
* test-dowhile.llull
* test-elseif.llull
* test-exemple-pretty.llull
* test-exemple.llull
* test-exemple2.llull
* test-operatorAssig.llull
* test-string.llull