all: init, myparser, test1, test2, test3, clean

init:
	java -cp ../../../antlr-3.5.2-complete-no-st3.jar org.antlr.Tool

myparser:
	java -jar ../../../antlr-3.5.2-complete-no-st3.jar myparser.g
	javac -cp ../../../antlr-3.5.2-complete-no-st3.jar:. *.java

test1:
	java -cp ../../../antlr-3.5.2-complete-no-st3.jar:. testParser test1.c

test2:
	java -cp ../../../antlr-3.5.2-complete-no-st3.jar:. testParser test2.c

test3:
	java -cp ../../../antlr-3.5.2-complete-no-st3.jar:. testParser test3.c

clean:
	rm myparserLexer.java
	rm myparserParser.java
	rm ./*.class
	rm ./*.tokens
