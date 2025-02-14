// Generated from com/dinaxis/CPP.g4 by ANTLR 4.9.3
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
		T__0=1, IF=2, ELSE=3, WHILE=4, RETURN=5, INT=6, FLOAT=7, DOUBLE=8, CHAR=9, 
		VOID=10, STRING=11, ASSIGN=12, PLUS=13, MINUS=14, MULT=15, DIV=16, MOD=17, 
		LT=18, GT=19, LE=20, GE=21, EQ=22, NEQ=23, AND=24, OR=25, NOT=26, SEMI=27, 
		COMMA=28, DOT=29, SCOPE=30, STREAM_OUT=31, LPAREN=32, RPAREN=33, LBRACE=34, 
		RBRACE=35, LBRACK=36, RBRACK=37, ID=38, STD=39, COUT=40, STRING_LITERAL=41, 
		NUMBER=42, LINE_COMMENT=43, BLOCK_COMMENT=44, WS=45;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "IF", "ELSE", "WHILE", "RETURN", "INT", "FLOAT", "DOUBLE", "CHAR", 
			"VOID", "STRING", "ASSIGN", "PLUS", "MINUS", "MULT", "DIV", "MOD", "LT", 
			"GT", "LE", "GE", "EQ", "NEQ", "AND", "OR", "NOT", "SEMI", "COMMA", "DOT", 
			"SCOPE", "STREAM_OUT", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", 
			"RBRACK", "ID", "STD", "COUT", "STRING_LITERAL", "NUMBER", "LINE_COMMENT", 
			"BLOCK_COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'if'", "'else'", "'while'", "'return'", "'int'", "'float'", 
			"'double'", "'char'", "'void'", "'string'", "'='", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'&&'", "'||'", 
			"'!'", "';'", "','", "'.'", "'::'", "'<<'", "'('", "')'", "'{'", "'}'", 
			"'['", "']'", null, "'std'", "'cout'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "IF", "ELSE", "WHILE", "RETURN", "INT", "FLOAT", "DOUBLE", 
			"CHAR", "VOID", "STRING", "ASSIGN", "PLUS", "MINUS", "MULT", "DIV", "MOD", 
			"LT", "GT", "LE", "GE", "EQ", "NEQ", "AND", "OR", "NOT", "SEMI", "COMMA", 
			"DOT", "SCOPE", "STREAM_OUT", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
			"LBRACK", "RBRACK", "ID", "STD", "COUT", "STRING_LITERAL", "NUMBER", 
			"LINE_COMMENT", "BLOCK_COMMENT", "WS"
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
	               text.equals("string") || text.equals("cout") || text.equals("std");
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
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 37:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2/\u011e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3"+
		"\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3"+
		"\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3"+
		"\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3"+
		" \3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\7\'\u00d9\n\'\f"+
		"\'\16\'\u00dc\13\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\7*\u00eb\n"+
		"*\f*\16*\u00ee\13*\3*\3*\3+\6+\u00f3\n+\r+\16+\u00f4\3+\3+\6+\u00f9\n"+
		"+\r+\16+\u00fa\5+\u00fd\n+\3,\3,\3,\3,\7,\u0103\n,\f,\16,\u0106\13,\3"+
		",\3,\3-\3-\3-\3-\7-\u010e\n-\f-\16-\u0111\13-\3-\3-\3-\3-\3-\3.\6.\u0119"+
		"\n.\r.\16.\u011a\3.\3.\3\u010f\2/\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/\3\2"+
		"\b\5\2C\\aac|\6\2\62;C\\aac|\5\2\f\f\17\17$$\3\2\62;\4\2\f\f\17\17\5\2"+
		"\13\f\17\17\"\"\2\u0125\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\3]\3"+
		"\2\2\2\5c\3\2\2\2\7f\3\2\2\2\tk\3\2\2\2\13q\3\2\2\2\rx\3\2\2\2\17|\3\2"+
		"\2\2\21\u0082\3\2\2\2\23\u0089\3\2\2\2\25\u008e\3\2\2\2\27\u0093\3\2\2"+
		"\2\31\u009a\3\2\2\2\33\u009c\3\2\2\2\35\u009e\3\2\2\2\37\u00a0\3\2\2\2"+
		"!\u00a2\3\2\2\2#\u00a4\3\2\2\2%\u00a6\3\2\2\2\'\u00a8\3\2\2\2)\u00aa\3"+
		"\2\2\2+\u00ad\3\2\2\2-\u00b0\3\2\2\2/\u00b3\3\2\2\2\61\u00b6\3\2\2\2\63"+
		"\u00b9\3\2\2\2\65\u00bc\3\2\2\2\67\u00be\3\2\2\29\u00c0\3\2\2\2;\u00c2"+
		"\3\2\2\2=\u00c4\3\2\2\2?\u00c7\3\2\2\2A\u00ca\3\2\2\2C\u00cc\3\2\2\2E"+
		"\u00ce\3\2\2\2G\u00d0\3\2\2\2I\u00d2\3\2\2\2K\u00d4\3\2\2\2M\u00d6\3\2"+
		"\2\2O\u00df\3\2\2\2Q\u00e3\3\2\2\2S\u00e8\3\2\2\2U\u00f2\3\2\2\2W\u00fe"+
		"\3\2\2\2Y\u0109\3\2\2\2[\u0118\3\2\2\2]^\7e\2\2^_\7n\2\2_`\7c\2\2`a\7"+
		"u\2\2ab\7u\2\2b\4\3\2\2\2cd\7k\2\2de\7h\2\2e\6\3\2\2\2fg\7g\2\2gh\7n\2"+
		"\2hi\7u\2\2ij\7g\2\2j\b\3\2\2\2kl\7y\2\2lm\7j\2\2mn\7k\2\2no\7n\2\2op"+
		"\7g\2\2p\n\3\2\2\2qr\7t\2\2rs\7g\2\2st\7v\2\2tu\7w\2\2uv\7t\2\2vw\7p\2"+
		"\2w\f\3\2\2\2xy\7k\2\2yz\7p\2\2z{\7v\2\2{\16\3\2\2\2|}\7h\2\2}~\7n\2\2"+
		"~\177\7q\2\2\177\u0080\7c\2\2\u0080\u0081\7v\2\2\u0081\20\3\2\2\2\u0082"+
		"\u0083\7f\2\2\u0083\u0084\7q\2\2\u0084\u0085\7w\2\2\u0085\u0086\7d\2\2"+
		"\u0086\u0087\7n\2\2\u0087\u0088\7g\2\2\u0088\22\3\2\2\2\u0089\u008a\7"+
		"e\2\2\u008a\u008b\7j\2\2\u008b\u008c\7c\2\2\u008c\u008d\7t\2\2\u008d\24"+
		"\3\2\2\2\u008e\u008f\7x\2\2\u008f\u0090\7q\2\2\u0090\u0091\7k\2\2\u0091"+
		"\u0092\7f\2\2\u0092\26\3\2\2\2\u0093\u0094\7u\2\2\u0094\u0095\7v\2\2\u0095"+
		"\u0096\7t\2\2\u0096\u0097\7k\2\2\u0097\u0098\7p\2\2\u0098\u0099\7i\2\2"+
		"\u0099\30\3\2\2\2\u009a\u009b\7?\2\2\u009b\32\3\2\2\2\u009c\u009d\7-\2"+
		"\2\u009d\34\3\2\2\2\u009e\u009f\7/\2\2\u009f\36\3\2\2\2\u00a0\u00a1\7"+
		",\2\2\u00a1 \3\2\2\2\u00a2\u00a3\7\61\2\2\u00a3\"\3\2\2\2\u00a4\u00a5"+
		"\7\'\2\2\u00a5$\3\2\2\2\u00a6\u00a7\7>\2\2\u00a7&\3\2\2\2\u00a8\u00a9"+
		"\7@\2\2\u00a9(\3\2\2\2\u00aa\u00ab\7>\2\2\u00ab\u00ac\7?\2\2\u00ac*\3"+
		"\2\2\2\u00ad\u00ae\7@\2\2\u00ae\u00af\7?\2\2\u00af,\3\2\2\2\u00b0\u00b1"+
		"\7?\2\2\u00b1\u00b2\7?\2\2\u00b2.\3\2\2\2\u00b3\u00b4\7#\2\2\u00b4\u00b5"+
		"\7?\2\2\u00b5\60\3\2\2\2\u00b6\u00b7\7(\2\2\u00b7\u00b8\7(\2\2\u00b8\62"+
		"\3\2\2\2\u00b9\u00ba\7~\2\2\u00ba\u00bb\7~\2\2\u00bb\64\3\2\2\2\u00bc"+
		"\u00bd\7#\2\2\u00bd\66\3\2\2\2\u00be\u00bf\7=\2\2\u00bf8\3\2\2\2\u00c0"+
		"\u00c1\7.\2\2\u00c1:\3\2\2\2\u00c2\u00c3\7\60\2\2\u00c3<\3\2\2\2\u00c4"+
		"\u00c5\7<\2\2\u00c5\u00c6\7<\2\2\u00c6>\3\2\2\2\u00c7\u00c8\7>\2\2\u00c8"+
		"\u00c9\7>\2\2\u00c9@\3\2\2\2\u00ca\u00cb\7*\2\2\u00cbB\3\2\2\2\u00cc\u00cd"+
		"\7+\2\2\u00cdD\3\2\2\2\u00ce\u00cf\7}\2\2\u00cfF\3\2\2\2\u00d0\u00d1\7"+
		"\177\2\2\u00d1H\3\2\2\2\u00d2\u00d3\7]\2\2\u00d3J\3\2\2\2\u00d4\u00d5"+
		"\7_\2\2\u00d5L\3\2\2\2\u00d6\u00da\t\2\2\2\u00d7\u00d9\t\3\2\2\u00d8\u00d7"+
		"\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db"+
		"\u00dd\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00de\6\'\2\2\u00deN\3\2\2\2"+
		"\u00df\u00e0\7u\2\2\u00e0\u00e1\7v\2\2\u00e1\u00e2\7f\2\2\u00e2P\3\2\2"+
		"\2\u00e3\u00e4\7e\2\2\u00e4\u00e5\7q\2\2\u00e5\u00e6\7w\2\2\u00e6\u00e7"+
		"\7v\2\2\u00e7R\3\2\2\2\u00e8\u00ec\7$\2\2\u00e9\u00eb\n\4\2\2\u00ea\u00e9"+
		"\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\u00ef\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f0\7$\2\2\u00f0T\3\2\2\2\u00f1"+
		"\u00f3\t\5\2\2\u00f2\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f2\3\2"+
		"\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00fc\3\2\2\2\u00f6\u00f8\7\60\2\2\u00f7"+
		"\u00f9\t\5\2\2\u00f8\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00f8\3\2"+
		"\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00f6\3\2\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fdV\3\2\2\2\u00fe\u00ff\7\61\2\2\u00ff\u0100\7\61\2"+
		"\2\u0100\u0104\3\2\2\2\u0101\u0103\n\6\2\2\u0102\u0101\3\2\2\2\u0103\u0106"+
		"\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0107\3\2\2\2\u0106"+
		"\u0104\3\2\2\2\u0107\u0108\b,\2\2\u0108X\3\2\2\2\u0109\u010a\7\61\2\2"+
		"\u010a\u010b\7,\2\2\u010b\u010f\3\2\2\2\u010c\u010e\13\2\2\2\u010d\u010c"+
		"\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u0110\3\2\2\2\u010f\u010d\3\2\2\2\u0110"+
		"\u0112\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0113\7,\2\2\u0113\u0114\7\61"+
		"\2\2\u0114\u0115\3\2\2\2\u0115\u0116\b-\2\2\u0116Z\3\2\2\2\u0117\u0119"+
		"\t\7\2\2\u0118\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u0118\3\2\2\2\u011a"+
		"\u011b\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\b.\2\2\u011d\\\3\2\2\2"+
		"\13\2\u00da\u00ec\u00f4\u00fa\u00fc\u0104\u010f\u011a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}