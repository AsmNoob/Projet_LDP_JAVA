JFLAGS = -Xlint
JC = javac

CLASSES = *.java
OBJECT = $(CLASSES:.java=.class)

run: all
	@echo -e "\e[0;31m================= Run ================\e[0m"
	java main 

all: $(OBJECT)

$(OBJECT):$(CLASSES)
	$(JC) $(JFLAGS) $^

clean:
	$(RM) *.class


