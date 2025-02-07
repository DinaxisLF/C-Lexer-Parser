grammar CPP;

@members {
    private boolean isKeyword(String text) {
        return text.equals("if") || text.equals("else") || text.equals("while") ||
               text.equals("return") || text.equals("int") || text.equals("float") ||
               text.equals("double") || text.equals("char") || text.equals("void") ||
               text.equals("string") || text.equals("cout") || text.equals("std");
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
    | returnStatement
    | functionDefinition
    | block
    | coutStatement
    | classDefinition  // Agregar definición de clase como una declaración
    ;

// Declaraciones
declaration: type ID (ASSIGN expression)? SEMI;

// Expresión
expressionStatement: (ID ASSIGN expression | expression) SEMI;

// Estructuras de control
ifStatement: IF LPAREN expression RPAREN statement (ELSE statement)?;
whileStatement: WHILE LPAREN expression RPAREN statement;
returnStatement: RETURN expression? SEMI;

// Definición de funciones
functionDefinition: type ID LPAREN parameterList? RPAREN block;

parameterList: type ID (COMMA type ID)*;
block: LBRACE statement* RBRACE;

// Definición de clases
classDefinition: 'class' ID LBRACE classMember* RBRACE;

// Miembros de la clase (atributos y métodos)
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

// **Soporte para `std::cout << "texto";`**
coutStatement: SCOPE? STD SCOPE COUT (STREAM_OUT expression)+ SEMI;


// **Tokens definidos en el lexer**
IF: 'if';
ELSE: 'else';
WHILE: 'while';
RETURN: 'return';
INT: 'int';
FLOAT: 'float';
DOUBLE: 'double';
CHAR: 'char';
VOID: 'void';
STRING: 'string';

// Operadores y símbolos
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
SCOPE: '::'; // **Resolución de ámbito (`std::cout`)**
STREAM_OUT: '<<'; // **Soporte para `cout << "texto"`**
LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';
LBRACK: '[';
RBRACK: ']';

// **Corrección de Identificadores**
ID: [a-zA-Z_][a-zA-Z0-9_]*
    { !isKeyword(getText()) }?; // Evita palabras clave como identificadores

// **Corrección de `std` y `cout`**
STD: 'std';
COUT: 'cout';

// **Corrección de STRING_LITERAL**
STRING_LITERAL: '"' (~["\r\n])* '"';

// **Corrección de NUMBER**
NUMBER: [0-9]+ ('.' [0-9]+)?;

// **Comentarios**
LINE_COMMENT: '//' ~[\r\n]* -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;

// **Espacios en blanco**
WS: [ \t\r\n]+ -> skip;
