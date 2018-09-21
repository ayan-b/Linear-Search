@ECHO off & setlocal EnableDelayedExpansion
REM // Author       : Antony Tanuputra
REM // Theme        : LinearSearch
REM // Git          : https://github.com/aseven7
REM // Simple Usage : 
REM // LinearSearch.bat <List String> <String to search>
REM // in command prompt type as below:
REM // >LinearSearch.bat "AA BB CC DD EE" "DD"

REM // Acqusition variable argument1 as list
SET arg1=%~1
REM // Acqusition variable argument2 as target search
SET arg2=%~2
REM // Definition counter variable
SET /a count = 0
REM // Definition flag whenever found or not
SET found=0

REM // For Loop List (Linear Search)
FOR %%s IN (%arg1%) DO (
	SET /a count += 1
	IF %%s==%arg2% (
		SET found=1
		@ECHO "Found for : %%s, Index : !count!"
	)
)

REM // If not found, print not found
IF %found%==0 (
	@ECHO "Not found for : %arg2%, Total : %count%"
)