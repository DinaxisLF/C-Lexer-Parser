grammar CPP;

@members {
    private boolean isKeyword(String text) {
        return text.equals("if") || text.equals("else") || text.equals("while") ||
               text.equals("return") || text.equals("int") || text.equals("float") ||
               text.equals("double") || text.equals("char") || text.equals("void") ||
               text.equals("string") || text.equals("cout") || text.equals("std") ||
               text.equals("for"); //agreguee fooooor
    }
}

// Programa completo
program: statement* EOF;

// Declaraciones y estructuras de control
statement
    : declaration
    | expressionStatement
    | ifStatement
    | whileStatement
    | forStatement         // Agregar el fooooooor aquiiiii
    | returnStatement
    | functionDefinition
    | block
    | coutStatement
    | classDefinition  // Definición de clase
    ;

// Declaraciones
declaration: type ID (ASSIGN expression)? SEMI;

// Expresión
expressionStatement: (ID ASSIGN expression | expression) SEMI;

// Estructuras de control
ifStatement: IF LPAREN expression RPAREN statement (ELSE statement)?;
whileStatement: WHILE LPAREN expression RPAREN statement;
returnStatement: RETURN expression? SEMI;

forStatement: 'for' '(' expressionStatement expressionStatement expressionStatement ')' statement; //fooooor

// Definición de funciones
functionDefinition: type ID LPAREN parameterList? RPAREN block;
parameterList: type ID (COMMA type ID)*;
block: LBRACE statement* RBRACE;

// Definición de clases
classDefinition: 'class' ID LBRACE classMember* RBRACE;
classMember: (declaration | functionDefinition);

// Creación de objetos
objectCreation: ID ID LPAREN argumentList? RPAREN;
argumentList: expression (COMMA expression)*;

// Acceso a miembros de la clase
memberAccess: ID DOT ID LPAREN argumentList? RPAREN?;

// Tipos de datos
type: INT | FLOAT | DOUBLE | CHAR | VOID | STRING;

// Expresiones
expression
    : ID                               # IdentifierExpr
    | NUMBER                           # NumberExpr
    | STRING_LITERAL                   # StringExpr
    | expression (PLUS | MINUS | MULT | DIV | MOD) expression  # AddSubMulDivExpr
    | expression (EQ | NEQ | LT | GT | LE | GE) expression     # RelationalExpr
    | expression (AND | OR) expression # LogicalExpr
    | NOT expression                   # NotExpr
    | LPAREN expression RPAREN         # ParenExpr
    | objectCreation                    # ObjectCreationExpr
    | memberAccess                     # MemberAccessExpr
    ;

// Soporte para `std::cout << "texto";`
coutStatement: SCOPE? STD SCOPE COUT (STREAM_OUT expression)+ SEMI;

// ----------------------
// Reglas Léxicas
// ----------------------

// 1. Comentarios y espacios (se descartan)
LINE_COMMENT: '//' ~[\r\n]* -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;
WS: [ \t\r\n]+ -> skip;

// 2. Reglas para palabras reservadas y operadores
IF: 'if';
ELSE: 'else';
WHILE: 'while';
FOR: 'for';           // Agregar la palabra reservada foooooor
RETURN: 'return';
INT: 'int';
FLOAT: 'float';
DOUBLE: 'double';
CHAR: 'char';
VOID: 'void';
STRING: 'string';

ASSIGN: '=';
PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
MOD: '%';
LT: '<';
GT: '>';
LE: '<=';
GE: '>=';
EQ: '==';
NEQ: '!=';
AND: '&&';
OR: '||';
NOT: '!';

SEMI: ';';
COMMA: ',';
DOT: '.';
SCOPE: '::';
STREAM_OUT: '<<';
LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';
LBRACK: '[';
RBRACK: ']';

// 3. Identificadores y palabras especiales
ID: [a-zA-Z_][a-zA-Z0-9_]*
    { !isKeyword(getText()) }?;
STD: 'std';
COUT: 'cout';

// 4. Literales y números
// Regla para cadenas mal formadas (se coloca primero para capturar cadenas abiertas sin cierre)
UNCLOSED_STRING: '"' (~["\r\n])* {
    LexerNoViableAltException e = new LexerNoViableAltException(this, _input, _tokenStartCharIndex, null);
    notifyListeners(e);
    skip();
} ;

//Regla para cadenas bien formadas
STRING_LITERAL: '"' (~["\r\n])* '"' ;

// Número mal formado (por ejemplo, con punto sin dígito siguiente)
INVALID_NUMBER: [0-9]+ '.' {
    LexerNoViableAltException e = new LexerNoViableAltException(this, _input, _tokenStartCharIndex, null);
    notifyListeners(e);
    skip();
} ;

// Número correcto
NUMBER: [0-9]+ ('.' [0-9]+)?;

// Regla para identificadores mal formados (por ejemplo, que empiecen con dígito)
INVALID_ID: [0-9][a-zA-Z0-9_]* {
    LexerNoViableAltException e = new LexerNoViableAltException(this, _input, _tokenStartCharIndex, null);
    notifyListeners(e);
    skip();
} ;

// 5. Regla para capturar cualquier otro carácter no reconocido
ERROR_CHAR: . {
    LexerNoViableAltException e = new LexerNoViableAltException(this, _input, _tokenStartCharIndex, null);
    notifyListeners(e);
    skip();
} ;
