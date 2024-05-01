cls

rem compile
md build
javac -d build *.java

rem run
java -cp build Main
pause

rem clean
rd /s/q build
