grammar PropertyFile;

@members {

   void startFile(){ } // blank implementations

   void finishFile(){ }

   void defineProperty(Token name, Token value) { }

}

file : {startFile();} prop+ {finishFile();} ;

prop : ID '=' STRING'\n'{defineProperty($ID, $STRING)} ;

ID : [a-z]+ ;

STRING : '"' .*? '"';