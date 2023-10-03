grammar cc;

start : (c+=commands)* EOF;


commands : '.hardware ' sig=SIGNAL '\n'* #Hwcmd
         | '.inputs '  sig+=SIGNAL+ '\n'*   #Incmd
         | '.outputs ' sig+=SIGNAL+ '\n'* #Oucmd
         | '.update' '\n'*  (ass+=assignment)+ '\n'* #Upcmd
         | '.latches' '\n'*  (lat+=latch)+ '\n'*  #Lacmd
         | '.simulate' '\n'*  (io+=iovalue)+ '\n'* #Sicmd
        ;


assignment : sig=SIGNAL '=' e=exp '\n'?;
latch : sig1=SIGNAL '->' sig2=SIGNAL '\n'?;
iovalue : sig1=SIGNAL '=' bin=BINARY '\n'?;


BINARY : [0-1]+;
SIGNAL : [a-zA-Z0-9]+;




exp : '(' e=exp')'          #ParenOp
    | op='!' e=exp          #NotOp
    | e1=exp op='&&' e2=exp #AndOp
    | e1=exp op='||' e2=exp #OrOp
    | sig=SIGNAL            #SigOp
    ;

ignore : COMMENT|MULTICOMMENT;



WHITESPACE : [ \t\n]+ -> skip;
COMMENT : '//' ~[\n]* ->skip;
MULTICOMMENT : '/*' .*? '*/' ->skip;
