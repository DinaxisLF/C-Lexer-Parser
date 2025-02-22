// Generated from com\dinaxis\CPP.g4 by ANTLR 4.9.3
package com.dinaxis;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CPPLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, LINE_COMMENT=2, BLOCK_COMMENT=3, WS=4, IF=5, ELSE=6, WHILE=7, 
		FOR=8, RETURN=9, INT=10, FLOAT=11, DOUBLE=12, CHAR=13, VOID=14, STRING=15, 
		ASSIGN=16, PLUS=17, MINUS=18, MULT=19, DIV=20, MOD=21, LT=22, GT=23, LE=24, 
		GE=25, EQ=26, NEQ=27, AND=28, OR=29, NOT=30, SEMI=31, COMMA=32, DOT=33, 
		SCOPE=34, STREAM_OUT=35, LPAREN=36, RPAREN=37, LBRACE=38, RBRACE=39, LBRACK=40, 
		RBRACK=41, ID=42, STD=43, COUT=44, UNCLOSED_STRING=45, STRING_LITERAL=46, 
		INVALID_NUMBER=47, NUMBER=48, INVALID_ID=49, ERROR_CHAR=50;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "LINE_COMMENT", "BLOCK_COMMENT", "WS", "IF", "ELSE", "WHILE", 
			"FOR", "RETURN", "INT", "FLOAT", "DOUBLE", "CHAR", "VOID", "STRING", 
			"ASSIGN", "PLUS", "MINUS", "MULT", "DIV", "MOD", "LT", "GT", "LE", "GE", 
			"EQ", "NEQ", "AND", "OR", "NOT", "SEMI", "COMMA", "DOT", "SCOPE", "STREAM_OUT", 
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "ID", "STD", 
			"COUT", "UNCLOSED_STRING", "STRING_LITERAL", "INVALID_NUMBER", "NUMBER", 
			"INVALID_ID", "ERROR_CHAR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", null, null, null, "'if'", "'else'", "'while'", "'for'", 
			"'return'", "'int'", "'float'", "'double'", "'char'", "'void'", "'string'", 
			"'='", "'+'", "'-'", "'*'", "'/'", "'%'", "'<'", "'>'", "'<='", "'>='", 
			"'=='", "'!='", "'&&'", "'||'", "'!'", "';'", "','", "'.'", "'::'", "'<<'", 
			"'('", "')'", "'{'", "'}'", "'['", "']'", null, "'std'", "'cout'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "LINE_COMMENT", "BLOCK_COMMENT", "WS", "IF", "ELSE", "WHILE", 
			"FOR", "RETURN", "INT", "FLOAT", "DOUBLE", "CHAR", "VOID", "STRING", 
			"ASSIGN", "PLUS", "MINUS", "MULT", "DIV", "MOD", "LT", "GT", "LE", "GE", 
			"EQ", "NEQ", "AND", "OR", "NOT", "SEMI", "COMMA", "DOT", "SCOPE", "STREAM_OUT", 
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "ID", "STD", 
			"COUT", "UNCLOSED_STRING", "STRING_LITERAL", "INVALID_NUMBER", "NUMBER", 
			"INVALID_ID", "ERROR_CHAR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	    private boolean isKeyword(String text) {
	        return text.equals("if") || text.equals("else") || text.equals("while") ||
	               text.equals("return") || text.equals("int") || text.equals("float") ||
	               text.equals("double") || text.equals("char") || text.equals("void") ||
	               text.equals("string") || text.equals("cout") || text.equals("std") ||
	               text.equals("for"); //agreguee fooooor
	    }


	public CPPLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CPP.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 44:
			UNCLOSED_STRING_action((RuleContext)_localctx, actionIndex);
			break;
		case 46:
			INVALID_NUMBER_action((RuleContext)_localctx, actionIndex);
			break;
		case 48:
			INVALID_ID_action((RuleContext)_localctx, actionIndex);
			break;
		case 49:
			ERROR_CHAR_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void UNCLOSED_STRING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:

			    LexerNoViableAltException e = new LexerNoViableAltException(this, _input, _tokenStartCharIndex, null);
			    notifyListeners(e);
			    skip();

			break;
		}
	}
	private void INVALID_NUMBER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:

			    LexerNoViableAltException e = new LexerNoViableAltException(this, _input, _tokenStartCharIndex, null);
			    notifyListeners(e);
			    skip();

			break;
		}
	}
	private void INVALID_ID_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:

			    LexerNoViableAltException e = new LexerNoViableAltException(this, _input, _tokenStartCharIndex, null);
			    notifyListeners(e);
			    skip();

			break;
		}
	}
	private void ERROR_CHAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:

			    LexerNoViableAltException e = new LexerNoViableAltException(this, _input, _tokenStartCharIndex, null);
			    notifyListeners(e);
			    skip();

			break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 41:
			return ID_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean ID_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return  !isKeyword(getText()) ;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\64\u0149\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3r\n\3\f\3\16\3u\13\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\7\4}\n\4\f\4\16\4\u0080\13\4\3\4\3\4\3\4\3\4\3\4\3\5\6"+
		"\5\u0088\n\5\r\5\16\5\u0089\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3"+
		"\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3"+
		"\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\""+
		"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\7+"+
		"\u0107\n+\f+\16+\u010a\13+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\7.\u0119"+
		"\n.\f.\16.\u011c\13.\3.\3.\3/\3/\7/\u0122\n/\f/\16/\u0125\13/\3/\3/\3"+
		"\60\6\60\u012a\n\60\r\60\16\60\u012b\3\60\3\60\3\60\3\61\6\61\u0132\n"+
		"\61\r\61\16\61\u0133\3\61\3\61\6\61\u0138\n\61\r\61\16\61\u0139\5\61\u013c"+
		"\n\61\3\62\3\62\7\62\u0140\n\62\f\62\16\62\u0143\13\62\3\62\3\62\3\63"+
		"\3\63\3\63\3~\2\64\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\64\3\2\b\4\2\f\f\17\17\5\2\13\f\17\17\"\"\5\2C\\aac|\6\2\62;C\\aac|"+
		"\5\2\f\f\17\17$$\3\2\62;\2\u0153\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2"+
		"\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\3g\3\2\2\2"+
		"\5m\3\2\2\2\7x\3\2\2\2\t\u0087\3\2\2\2\13\u008d\3\2\2\2\r\u0090\3\2\2"+
		"\2\17\u0095\3\2\2\2\21\u009b\3\2\2\2\23\u009f\3\2\2\2\25\u00a6\3\2\2\2"+
		"\27\u00aa\3\2\2\2\31\u00b0\3\2\2\2\33\u00b7\3\2\2\2\35\u00bc\3\2\2\2\37"+
		"\u00c1\3\2\2\2!\u00c8\3\2\2\2#\u00ca\3\2\2\2%\u00cc\3\2\2\2\'\u00ce\3"+
		"\2\2\2)\u00d0\3\2\2\2+\u00d2\3\2\2\2-\u00d4\3\2\2\2/\u00d6\3\2\2\2\61"+
		"\u00d8\3\2\2\2\63\u00db\3\2\2\2\65\u00de\3\2\2\2\67\u00e1\3\2\2\29\u00e4"+
		"\3\2\2\2;\u00e7\3\2\2\2=\u00ea\3\2\2\2?\u00ec\3\2\2\2A\u00ee\3\2\2\2C"+
		"\u00f0\3\2\2\2E\u00f2\3\2\2\2G\u00f5\3\2\2\2I\u00f8\3\2\2\2K\u00fa\3\2"+
		"\2\2M\u00fc\3\2\2\2O\u00fe\3\2\2\2Q\u0100\3\2\2\2S\u0102\3\2\2\2U\u0104"+
		"\3\2\2\2W\u010d\3\2\2\2Y\u0111\3\2\2\2[\u0116\3\2\2\2]\u011f\3\2\2\2_"+
		"\u0129\3\2\2\2a\u0131\3\2\2\2c\u013d\3\2\2\2e\u0146\3\2\2\2gh\7e\2\2h"+
		"i\7n\2\2ij\7c\2\2jk\7u\2\2kl\7u\2\2l\4\3\2\2\2mn\7\61\2\2no\7\61\2\2o"+
		"s\3\2\2\2pr\n\2\2\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2"+
		"us\3\2\2\2vw\b\3\2\2w\6\3\2\2\2xy\7\61\2\2yz\7,\2\2z~\3\2\2\2{}\13\2\2"+
		"\2|{\3\2\2\2}\u0080\3\2\2\2~\177\3\2\2\2~|\3\2\2\2\177\u0081\3\2\2\2\u0080"+
		"~\3\2\2\2\u0081\u0082\7,\2\2\u0082\u0083\7\61\2\2\u0083\u0084\3\2\2\2"+
		"\u0084\u0085\b\4\2\2\u0085\b\3\2\2\2\u0086\u0088\t\3\2\2\u0087\u0086\3"+
		"\2\2\2\u0088\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\u008c\b\5\2\2\u008c\n\3\2\2\2\u008d\u008e\7k\2\2"+
		"\u008e\u008f\7h\2\2\u008f\f\3\2\2\2\u0090\u0091\7g\2\2\u0091\u0092\7n"+
		"\2\2\u0092\u0093\7u\2\2\u0093\u0094\7g\2\2\u0094\16\3\2\2\2\u0095\u0096"+
		"\7y\2\2\u0096\u0097\7j\2\2\u0097\u0098\7k\2\2\u0098\u0099\7n\2\2\u0099"+
		"\u009a\7g\2\2\u009a\20\3\2\2\2\u009b\u009c\7h\2\2\u009c\u009d\7q\2\2\u009d"+
		"\u009e\7t\2\2\u009e\22\3\2\2\2\u009f\u00a0\7t\2\2\u00a0\u00a1\7g\2\2\u00a1"+
		"\u00a2\7v\2\2\u00a2\u00a3\7w\2\2\u00a3\u00a4\7t\2\2\u00a4\u00a5\7p\2\2"+
		"\u00a5\24\3\2\2\2\u00a6\u00a7\7k\2\2\u00a7\u00a8\7p\2\2\u00a8\u00a9\7"+
		"v\2\2\u00a9\26\3\2\2\2\u00aa\u00ab\7h\2\2\u00ab\u00ac\7n\2\2\u00ac\u00ad"+
		"\7q\2\2\u00ad\u00ae\7c\2\2\u00ae\u00af\7v\2\2\u00af\30\3\2\2\2\u00b0\u00b1"+
		"\7f\2\2\u00b1\u00b2\7q\2\2\u00b2\u00b3\7w\2\2\u00b3\u00b4\7d\2\2\u00b4"+
		"\u00b5\7n\2\2\u00b5\u00b6\7g\2\2\u00b6\32\3\2\2\2\u00b7\u00b8\7e\2\2\u00b8"+
		"\u00b9\7j\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb\7t\2\2\u00bb\34\3\2\2\2\u00bc"+
		"\u00bd\7x\2\2\u00bd\u00be\7q\2\2\u00be\u00bf\7k\2\2\u00bf\u00c0\7f\2\2"+
		"\u00c0\36\3\2\2\2\u00c1\u00c2\7u\2\2\u00c2\u00c3\7v\2\2\u00c3\u00c4\7"+
		"t\2\2\u00c4\u00c5\7k\2\2\u00c5\u00c6\7p\2\2\u00c6\u00c7\7i\2\2\u00c7 "+
		"\3\2\2\2\u00c8\u00c9\7?\2\2\u00c9\"\3\2\2\2\u00ca\u00cb\7-\2\2\u00cb$"+
		"\3\2\2\2\u00cc\u00cd\7/\2\2\u00cd&\3\2\2\2\u00ce\u00cf\7,\2\2\u00cf(\3"+
		"\2\2\2\u00d0\u00d1\7\61\2\2\u00d1*\3\2\2\2\u00d2\u00d3\7\'\2\2\u00d3,"+
		"\3\2\2\2\u00d4\u00d5\7>\2\2\u00d5.\3\2\2\2\u00d6\u00d7\7@\2\2\u00d7\60"+
		"\3\2\2\2\u00d8\u00d9\7>\2\2\u00d9\u00da\7?\2\2\u00da\62\3\2\2\2\u00db"+
		"\u00dc\7@\2\2\u00dc\u00dd\7?\2\2\u00dd\64\3\2\2\2\u00de\u00df\7?\2\2\u00df"+
		"\u00e0\7?\2\2\u00e0\66\3\2\2\2\u00e1\u00e2\7#\2\2\u00e2\u00e3\7?\2\2\u00e3"+
		"8\3\2\2\2\u00e4\u00e5\7(\2\2\u00e5\u00e6\7(\2\2\u00e6:\3\2\2\2\u00e7\u00e8"+
		"\7~\2\2\u00e8\u00e9\7~\2\2\u00e9<\3\2\2\2\u00ea\u00eb\7#\2\2\u00eb>\3"+
		"\2\2\2\u00ec\u00ed\7=\2\2\u00ed@\3\2\2\2\u00ee\u00ef\7.\2\2\u00efB\3\2"+
		"\2\2\u00f0\u00f1\7\60\2\2\u00f1D\3\2\2\2\u00f2\u00f3\7<\2\2\u00f3\u00f4"+
		"\7<\2\2\u00f4F\3\2\2\2\u00f5\u00f6\7>\2\2\u00f6\u00f7\7>\2\2\u00f7H\3"+
		"\2\2\2\u00f8\u00f9\7*\2\2\u00f9J\3\2\2\2\u00fa\u00fb\7+\2\2\u00fbL\3\2"+
		"\2\2\u00fc\u00fd\7}\2\2\u00fdN\3\2\2\2\u00fe\u00ff\7\177\2\2\u00ffP\3"+
		"\2\2\2\u0100\u0101\7]\2\2\u0101R\3\2\2\2\u0102\u0103\7_\2\2\u0103T\3\2"+
		"\2\2\u0104\u0108\t\4\2\2\u0105\u0107\t\5\2\2\u0106\u0105\3\2\2\2\u0107"+
		"\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010b\3\2"+
		"\2\2\u010a\u0108\3\2\2\2\u010b\u010c\6+\2\2\u010cV\3\2\2\2\u010d\u010e"+
		"\7u\2\2\u010e\u010f\7v\2\2\u010f\u0110\7f\2\2\u0110X\3\2\2\2\u0111\u0112"+
		"\7e\2\2\u0112\u0113\7q\2\2\u0113\u0114\7w\2\2\u0114\u0115\7v\2\2\u0115"+
		"Z\3\2\2\2\u0116\u011a\7$\2\2\u0117\u0119\n\6\2\2\u0118\u0117\3\2\2\2\u0119"+
		"\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011d\3\2"+
		"\2\2\u011c\u011a\3\2\2\2\u011d\u011e\b.\3\2\u011e\\\3\2\2\2\u011f\u0123"+
		"\7$\2\2\u0120\u0122\n\6\2\2\u0121\u0120\3\2\2\2\u0122\u0125\3\2\2\2\u0123"+
		"\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0126\3\2\2\2\u0125\u0123\3\2"+
		"\2\2\u0126\u0127\7$\2\2\u0127^\3\2\2\2\u0128\u012a\t\7\2\2\u0129\u0128"+
		"\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c"+
		"\u012d\3\2\2\2\u012d\u012e\7\60\2\2\u012e\u012f\b\60\4\2\u012f`\3\2\2"+
		"\2\u0130\u0132\t\7\2\2\u0131\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0131"+
		"\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u013b\3\2\2\2\u0135\u0137\7\60\2\2"+
		"\u0136\u0138\t\7\2\2\u0137\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u0137"+
		"\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013c\3\2\2\2\u013b\u0135\3\2\2\2\u013b"+
		"\u013c\3\2\2\2\u013cb\3\2\2\2\u013d\u0141\t\7\2\2\u013e\u0140\t\5\2\2"+
		"\u013f\u013e\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142"+
		"\3\2\2\2\u0142\u0144\3\2\2\2\u0143\u0141\3\2\2\2\u0144\u0145\b\62\5\2"+
		"\u0145d\3\2\2\2\u0146\u0147\13\2\2\2\u0147\u0148\b\63\6\2\u0148f\3\2\2"+
		"\2\16\2s~\u0089\u0108\u011a\u0123\u012b\u0133\u0139\u013b\u0141\7\b\2"+
		"\2\3.\2\3\60\3\3\62\4\3\63\5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}