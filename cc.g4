grammar cc;

start : (commands)* EOF;


commands : HARDWARECMD
         | INPUTSCMD
         | OUTPUTSCMD
         | updatescmd
         | latchescmd
         | simulatedcmd
         | ignore
        ;


assignment : SIGNAL '=' exp '\n'?;
latch : SIGNAL '->' SIGNAL '\n'?;
iovalue : SIGNAL '=' BINARY '\n'?;


BINARY : [0-1]+;
SIGNAL : [a-zA-Z0-9]+;

HARDWARECMD : '.hardware ' SIGNAL;
INPUTSCMD : '.inputs '  (SIGNAL' ')* SIGNAL '\n';
OUTPUTSCMD : '.outputs '  (SIGNAL' ')* SIGNAL;

updatescmd : '.update' '\n'*  (assignment)+;
latchescmd : '.latches' '\n'*  (latch)+;
simulatedcmd : '.simulate' '\n'*  (iovalue)+;

exp : '(' exp')'
    | '!' exp
    | exp '&&' exp
    | exp '||' exp
    | SIGNAL
    ;

ignore : COMMENT|MULTICOMMENT;



WHITESPACE : [ \t\n]+ -> skip;
COMMENT : '//' ~[\n]* ->skip;
MULTICOMMENT : '/*' .*? '*/' ->skip;
