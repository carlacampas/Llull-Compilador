# LLULL COMPILER 
Compiler for a new programming language **Llull**. This language will have the extension *.llull*.

> For more information refer to: https://github.com/jordi-petit/lp-llull-2021

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

## Available Variable Types
* Strings
* Integers: *boolean statements will be identified by 0/1*
* Floats
* Arrays 

## Array Manipulation Syntax
* Creating a new array: *array(<variable_name>, <array_size>)*
* Getting value for a given index: *get(<variable_name>, <index_val>)*
* Setting value for a given index: *set(<variable_name>, <index_val>, <new_value>)*

## Conditional Statements
Conditional statements will be identified by the key words 'if', 'else if' (followed by a condition) and 'else'. The code corresponding to the conditional statement starts with '{' and ends with '}'.

## Loops
There are three different types of loops:
* for loops
* while loops
* do-while loops

## Comments
Coments in code can be placed using the charachter '#'.

## Input and Output
read(<variable_name>)
write(<variable_name>, <value>...): separated by comas

