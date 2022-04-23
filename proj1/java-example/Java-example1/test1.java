// $ANTLR 3.5.2 test1.g 2022-03-25 21:48:25

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class test1 extends Lexer {
	public static final int EOF=-1;
	public static final int ADD_OP=4;
	public static final int ANDAND_OP=5;
	public static final int BREAK_=6;
	public static final int CASE_=7;
	public static final int CHAR_TYPE=8;
	public static final int COLON_OP=9;
	public static final int COMMA_OP=10;
	public static final int COMMENT1=11;
	public static final int COMMENT2=12;
	public static final int DEC_NUM=13;
	public static final int DEC_OP=14;
	public static final int DEFUALT_=15;
	public static final int DIGIT=16;
	public static final int DIV_OP=17;
	public static final int DMARK_OP=18;
	public static final int EQU_OP=19;
	public static final int EQ_OP=20;
	public static final int ESP_OP=21;
	public static final int FLOAT_NUM=22;
	public static final int FLOAT_NUM1=23;
	public static final int FLOAT_NUM2=24;
	public static final int FLOAT_NUM3=25;
	public static final int FLOAT_TYPE=26;
	public static final int GE_OP=27;
	public static final int GRT_OP=28;
	public static final int HASHTAG=29;
	public static final int HEADER=30;
	public static final int ID=31;
	public static final int INDICA_OP=32;
	public static final int IND_VAR=33;
	public static final int INT_TYPE=34;
	public static final int LBAR_OP=35;
	public static final int LCUR_OP=36;
	public static final int LES_OP=37;
	public static final int LETTER=38;
	public static final int LE_OP=39;
	public static final int LINE_BREAK=40;
	public static final int LPAR_OP=41;
	public static final int LSHIFT_OP=42;
	public static final int MM_OP=43;
	public static final int MOD_OP=44;
	public static final int MUL_OP=45;
	public static final int NEW_LINE=46;
	public static final int NE_OP=47;
	public static final int PP_OP=48;
	public static final int QMARK_OP=49;
	public static final int RBAR_OP=50;
	public static final int RCUR_OP=51;
	public static final int RETURN_=52;
	public static final int RPAR_OP=53;
	public static final int RSHIFT_OP=54;
	public static final int SEMICOL_OP=55;
	public static final int SEN=56;
	public static final int SWITCH_=57;
	public static final int VOID_TYPE=58;
	public static final int WHILE_=59;
	public static final int WS=60;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public test1() {} 
	public test1(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public test1(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "test1.g"; }

	// $ANTLR start "INT_TYPE"
	public final void mINT_TYPE() throws RecognitionException {
		try {
			int _type = INT_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:10:11: ( 'int' )
			// test1.g:10:13: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_TYPE"

	// $ANTLR start "CHAR_TYPE"
	public final void mCHAR_TYPE() throws RecognitionException {
		try {
			int _type = CHAR_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:11:11: ( 'char' )
			// test1.g:11:13: 'char'
			{
			match("char"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR_TYPE"

	// $ANTLR start "VOID_TYPE"
	public final void mVOID_TYPE() throws RecognitionException {
		try {
			int _type = VOID_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:12:11: ( 'void' )
			// test1.g:12:13: 'void'
			{
			match("void"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VOID_TYPE"

	// $ANTLR start "FLOAT_TYPE"
	public final void mFLOAT_TYPE() throws RecognitionException {
		try {
			int _type = FLOAT_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:13:11: ( 'float' )
			// test1.g:13:13: 'float'
			{
			match("float"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_TYPE"

	// $ANTLR start "WHILE_"
	public final void mWHILE_() throws RecognitionException {
		try {
			int _type = WHILE_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:14:11: ( 'while' )
			// test1.g:14:13: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE_"

	// $ANTLR start "SWITCH_"
	public final void mSWITCH_() throws RecognitionException {
		try {
			int _type = SWITCH_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:15:11: ( 'switch' )
			// test1.g:15:13: 'switch'
			{
			match("switch"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SWITCH_"

	// $ANTLR start "CASE_"
	public final void mCASE_() throws RecognitionException {
		try {
			int _type = CASE_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:16:11: ( 'case' )
			// test1.g:16:13: 'case'
			{
			match("case"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CASE_"

	// $ANTLR start "BREAK_"
	public final void mBREAK_() throws RecognitionException {
		try {
			int _type = BREAK_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:17:11: ( 'break' )
			// test1.g:17:13: 'break'
			{
			match("break"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BREAK_"

	// $ANTLR start "RETURN_"
	public final void mRETURN_() throws RecognitionException {
		try {
			int _type = RETURN_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:18:11: ( 'return' )
			// test1.g:18:13: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RETURN_"

	// $ANTLR start "DEFUALT_"
	public final void mDEFUALT_() throws RecognitionException {
		try {
			int _type = DEFUALT_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:19:11: ( 'default' )
			// test1.g:19:13: 'default'
			{
			match("default"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DEFUALT_"

	// $ANTLR start "EQ_OP"
	public final void mEQ_OP() throws RecognitionException {
		try {
			int _type = EQ_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:25:7: ( '==' )
			// test1.g:25:9: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQ_OP"

	// $ANTLR start "LE_OP"
	public final void mLE_OP() throws RecognitionException {
		try {
			int _type = LE_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:26:7: ( '<=' )
			// test1.g:26:9: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LE_OP"

	// $ANTLR start "GE_OP"
	public final void mGE_OP() throws RecognitionException {
		try {
			int _type = GE_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:27:7: ( '>=' )
			// test1.g:27:9: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GE_OP"

	// $ANTLR start "NE_OP"
	public final void mNE_OP() throws RecognitionException {
		try {
			int _type = NE_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:28:7: ( '!=' )
			// test1.g:28:9: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NE_OP"

	// $ANTLR start "PP_OP"
	public final void mPP_OP() throws RecognitionException {
		try {
			int _type = PP_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:29:7: ( '++' )
			// test1.g:29:9: '++'
			{
			match("++"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PP_OP"

	// $ANTLR start "MM_OP"
	public final void mMM_OP() throws RecognitionException {
		try {
			int _type = MM_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:30:7: ( '--' )
			// test1.g:30:9: '--'
			{
			match("--"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MM_OP"

	// $ANTLR start "RSHIFT_OP"
	public final void mRSHIFT_OP() throws RecognitionException {
		try {
			int _type = RSHIFT_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:31:11: ( '<<' )
			// test1.g:31:13: '<<'
			{
			match("<<"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RSHIFT_OP"

	// $ANTLR start "LSHIFT_OP"
	public final void mLSHIFT_OP() throws RecognitionException {
		try {
			int _type = LSHIFT_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:32:11: ( '>>' )
			// test1.g:32:13: '>>'
			{
			match(">>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LSHIFT_OP"

	// $ANTLR start "ANDAND_OP"
	public final void mANDAND_OP() throws RecognitionException {
		try {
			int _type = ANDAND_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:33:11: ( '&&' )
			// test1.g:33:13: '&&'
			{
			match("&&"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ANDAND_OP"

	// $ANTLR start "INDICA_OP"
	public final void mINDICA_OP() throws RecognitionException {
		try {
			int _type = INDICA_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:34:11: ( '->' )
			// test1.g:34:13: '->'
			{
			match("->"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INDICA_OP"

	// $ANTLR start "NEW_LINE"
	public final void mNEW_LINE() throws RecognitionException {
		try {
			int _type = NEW_LINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:36:14: ( '\\n' )
			// test1.g:36:16: '\\n'
			{
			match('\n'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEW_LINE"

	// $ANTLR start "HASHTAG"
	public final void mHASHTAG() throws RecognitionException {
		try {
			int _type = HASHTAG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:37:14: ( '#' )
			// test1.g:37:16: '#'
			{
			match('#'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HASHTAG"

	// $ANTLR start "LINE_BREAK"
	public final void mLINE_BREAK() throws RecognitionException {
		try {
			int _type = LINE_BREAK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:38:14: ( ( '\\\\n' ) )
			// test1.g:38:16: ( '\\\\n' )
			{
			// test1.g:38:16: ( '\\\\n' )
			// test1.g:38:17: '\\\\n'
			{
			match("\\n"); 

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LINE_BREAK"

	// $ANTLR start "IND_VAR"
	public final void mIND_VAR() throws RecognitionException {
		try {
			int _type = IND_VAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:39:14: ( ( '*' ) ( ID ) )
			// test1.g:39:16: ( '*' ) ( ID )
			{
			// test1.g:39:16: ( '*' )
			// test1.g:39:17: '*'
			{
			match('*'); 
			}

			// test1.g:39:21: ( ID )
			// test1.g:39:22: ID
			{
			mID(); 

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IND_VAR"

	// $ANTLR start "HEADER"
	public final void mHEADER() throws RecognitionException {
		try {
			int _type = HEADER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:40:14: ( ( LETTER ) ( LETTER | DIGIT )* ( '.' ) ( LETTER ) )
			// test1.g:40:16: ( LETTER ) ( LETTER | DIGIT )* ( '.' ) ( LETTER )
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// test1.g:40:24: ( LETTER | DIGIT )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// test1.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			// test1.g:40:41: ( '.' )
			// test1.g:40:42: '.'
			{
			match('.'); 
			}

			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEADER"

	// $ANTLR start "ADD_OP"
	public final void mADD_OP() throws RecognitionException {
		try {
			int _type = ADD_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:46:8: ( '+' )
			// test1.g:46:10: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ADD_OP"

	// $ANTLR start "DEC_OP"
	public final void mDEC_OP() throws RecognitionException {
		try {
			int _type = DEC_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:47:8: ( '-' )
			// test1.g:47:10: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DEC_OP"

	// $ANTLR start "MUL_OP"
	public final void mMUL_OP() throws RecognitionException {
		try {
			int _type = MUL_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:48:8: ( '*' )
			// test1.g:48:10: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MUL_OP"

	// $ANTLR start "DIV_OP"
	public final void mDIV_OP() throws RecognitionException {
		try {
			int _type = DIV_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:49:8: ( '/' )
			// test1.g:49:10: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIV_OP"

	// $ANTLR start "EQU_OP"
	public final void mEQU_OP() throws RecognitionException {
		try {
			int _type = EQU_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:50:8: ( '=' )
			// test1.g:50:10: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQU_OP"

	// $ANTLR start "MOD_OP"
	public final void mMOD_OP() throws RecognitionException {
		try {
			int _type = MOD_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:51:8: ( '%' )
			// test1.g:51:10: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOD_OP"

	// $ANTLR start "LES_OP"
	public final void mLES_OP() throws RecognitionException {
		try {
			int _type = LES_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:52:8: ( '<' )
			// test1.g:52:10: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LES_OP"

	// $ANTLR start "GRT_OP"
	public final void mGRT_OP() throws RecognitionException {
		try {
			int _type = GRT_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:53:8: ( '>' )
			// test1.g:53:10: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GRT_OP"

	// $ANTLR start "ESP_OP"
	public final void mESP_OP() throws RecognitionException {
		try {
			int _type = ESP_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:54:8: ( '&' )
			// test1.g:54:10: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ESP_OP"

	// $ANTLR start "LPAR_OP"
	public final void mLPAR_OP() throws RecognitionException {
		try {
			int _type = LPAR_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:55:9: ( '(' )
			// test1.g:55:11: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LPAR_OP"

	// $ANTLR start "RPAR_OP"
	public final void mRPAR_OP() throws RecognitionException {
		try {
			int _type = RPAR_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:56:9: ( ')' )
			// test1.g:56:11: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RPAR_OP"

	// $ANTLR start "LCUR_OP"
	public final void mLCUR_OP() throws RecognitionException {
		try {
			int _type = LCUR_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:57:9: ( '{' )
			// test1.g:57:11: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LCUR_OP"

	// $ANTLR start "RCUR_OP"
	public final void mRCUR_OP() throws RecognitionException {
		try {
			int _type = RCUR_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:58:9: ( '}' )
			// test1.g:58:11: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RCUR_OP"

	// $ANTLR start "LBAR_OP"
	public final void mLBAR_OP() throws RecognitionException {
		try {
			int _type = LBAR_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:59:9: ( '[' )
			// test1.g:59:11: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LBAR_OP"

	// $ANTLR start "RBAR_OP"
	public final void mRBAR_OP() throws RecognitionException {
		try {
			int _type = RBAR_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:60:9: ( ']' )
			// test1.g:60:11: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RBAR_OP"

	// $ANTLR start "SEMICOL_OP"
	public final void mSEMICOL_OP() throws RecognitionException {
		try {
			int _type = SEMICOL_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:61:12: ( ';' )
			// test1.g:61:14: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMICOL_OP"

	// $ANTLR start "COLON_OP"
	public final void mCOLON_OP() throws RecognitionException {
		try {
			int _type = COLON_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:62:12: ( ':' )
			// test1.g:62:14: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLON_OP"

	// $ANTLR start "COMMA_OP"
	public final void mCOMMA_OP() throws RecognitionException {
		try {
			int _type = COMMA_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:63:12: ( ',' )
			// test1.g:63:14: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA_OP"

	// $ANTLR start "DMARK_OP"
	public final void mDMARK_OP() throws RecognitionException {
		try {
			int _type = DMARK_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:64:12: ( '\\\"' )
			// test1.g:64:14: '\\\"'
			{
			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DMARK_OP"

	// $ANTLR start "QMARK_OP"
	public final void mQMARK_OP() throws RecognitionException {
		try {
			int _type = QMARK_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:65:12: ( '\\'' )
			// test1.g:65:14: '\\''
			{
			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QMARK_OP"

	// $ANTLR start "DEC_NUM"
	public final void mDEC_NUM() throws RecognitionException {
		try {
			int _type = DEC_NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:67:9: ( ( '0' | ( '1' .. '9' ) ( DIGIT )* ) )
			// test1.g:67:11: ( '0' | ( '1' .. '9' ) ( DIGIT )* )
			{
			// test1.g:67:11: ( '0' | ( '1' .. '9' ) ( DIGIT )* )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='0') ) {
				alt3=1;
			}
			else if ( ((LA3_0 >= '1' && LA3_0 <= '9')) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// test1.g:67:12: '0'
					{
					match('0'); 
					}
					break;
				case 2 :
					// test1.g:67:18: ( '1' .. '9' ) ( DIGIT )*
					{
					if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// test1.g:67:28: ( DIGIT )*
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
							alt2=1;
						}

						switch (alt2) {
						case 1 :
							// test1.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop2;
						}
					}

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DEC_NUM"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:69:4: ( ( LETTER ) ( LETTER | DIGIT )* )
			// test1.g:69:6: ( LETTER ) ( LETTER | DIGIT )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// test1.g:69:14: ( LETTER | DIGIT )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')||(LA4_0 >= 'A' && LA4_0 <= 'Z')||LA4_0=='_'||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// test1.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop4;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "SEN"
	public final void mSEN() throws RecognitionException {
		try {
			int _type = SEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:70:5: ( ( ( '\\\"' ( options {greedy=false; } : . )* '\\\"' ) | ( '\\'' ( options {greedy=false; } : . )* '\\'' ) ) )
			// test1.g:70:7: ( ( '\\\"' ( options {greedy=false; } : . )* '\\\"' ) | ( '\\'' ( options {greedy=false; } : . )* '\\'' ) )
			{
			// test1.g:70:7: ( ( '\\\"' ( options {greedy=false; } : . )* '\\\"' ) | ( '\\'' ( options {greedy=false; } : . )* '\\'' ) )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='\"') ) {
				alt7=1;
			}
			else if ( (LA7_0=='\'') ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// test1.g:70:8: ( '\\\"' ( options {greedy=false; } : . )* '\\\"' )
					{
					// test1.g:70:8: ( '\\\"' ( options {greedy=false; } : . )* '\\\"' )
					// test1.g:70:9: '\\\"' ( options {greedy=false; } : . )* '\\\"'
					{
					match('\"'); 
					// test1.g:70:14: ( options {greedy=false; } : . )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0=='\"') ) {
							alt5=2;
						}
						else if ( ((LA5_0 >= '\u0000' && LA5_0 <= '!')||(LA5_0 >= '#' && LA5_0 <= '\uFFFF')) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// test1.g:70:39: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop5;
						}
					}

					match('\"'); 
					}

					}
					break;
				case 2 :
					// test1.g:70:51: ( '\\'' ( options {greedy=false; } : . )* '\\'' )
					{
					// test1.g:70:51: ( '\\'' ( options {greedy=false; } : . )* '\\'' )
					// test1.g:70:52: '\\'' ( options {greedy=false; } : . )* '\\''
					{
					match('\''); 
					// test1.g:70:57: ( options {greedy=false; } : . )*
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0=='\'') ) {
							alt6=2;
						}
						else if ( ((LA6_0 >= '\u0000' && LA6_0 <= '&')||(LA6_0 >= '(' && LA6_0 <= '\uFFFF')) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// test1.g:70:82: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop6;
						}
					}

					match('\''); 
					}

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEN"

	// $ANTLR start "FLOAT_NUM"
	public final void mFLOAT_NUM() throws RecognitionException {
		try {
			int _type = FLOAT_NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:72:10: ( FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3 )
			int alt8=3;
			alt8 = dfa8.predict(input);
			switch (alt8) {
				case 1 :
					// test1.g:72:12: FLOAT_NUM1
					{
					mFLOAT_NUM1(); 

					}
					break;
				case 2 :
					// test1.g:72:25: FLOAT_NUM2
					{
					mFLOAT_NUM2(); 

					}
					break;
				case 3 :
					// test1.g:72:38: FLOAT_NUM3
					{
					mFLOAT_NUM3(); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM"

	// $ANTLR start "FLOAT_NUM1"
	public final void mFLOAT_NUM1() throws RecognitionException {
		try {
			// test1.g:73:20: ( ( DIGIT )+ '.' ( DIGIT )* )
			// test1.g:73:22: ( DIGIT )+ '.' ( DIGIT )*
			{
			// test1.g:73:22: ( DIGIT )+
			int cnt9=0;
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// test1.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt9 >= 1 ) break loop9;
					EarlyExitException eee = new EarlyExitException(9, input);
					throw eee;
				}
				cnt9++;
			}

			match('.'); 
			// test1.g:73:33: ( DIGIT )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( ((LA10_0 >= '0' && LA10_0 <= '9')) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// test1.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop10;
				}
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM1"

	// $ANTLR start "FLOAT_NUM2"
	public final void mFLOAT_NUM2() throws RecognitionException {
		try {
			// test1.g:74:20: ( '.' ( DIGIT )+ )
			// test1.g:74:22: '.' ( DIGIT )+
			{
			match('.'); 
			// test1.g:74:25: ( DIGIT )+
			int cnt11=0;
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// test1.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt11 >= 1 ) break loop11;
					EarlyExitException eee = new EarlyExitException(11, input);
					throw eee;
				}
				cnt11++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM2"

	// $ANTLR start "FLOAT_NUM3"
	public final void mFLOAT_NUM3() throws RecognitionException {
		try {
			// test1.g:75:20: ( ( DIGIT )+ )
			// test1.g:75:22: ( DIGIT )+
			{
			// test1.g:75:22: ( DIGIT )+
			int cnt12=0;
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( ((LA12_0 >= '0' && LA12_0 <= '9')) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// test1.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt12 >= 1 ) break loop12;
					EarlyExitException eee = new EarlyExitException(12, input);
					throw eee;
				}
				cnt12++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM3"

	// $ANTLR start "COMMENT1"
	public final void mCOMMENT1() throws RecognitionException {
		try {
			int _type = COMMENT1;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:79:10: ( '//' ( . )* '\\n' )
			// test1.g:79:12: '//' ( . )* '\\n'
			{
			match("//"); 

			// test1.g:79:16: ( . )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0=='\n') ) {
					alt13=2;
				}
				else if ( ((LA13_0 >= '\u0000' && LA13_0 <= '\t')||(LA13_0 >= '\u000B' && LA13_0 <= '\uFFFF')) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// test1.g:79:17: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop13;
				}
			}

			match('\n'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT1"

	// $ANTLR start "COMMENT2"
	public final void mCOMMENT2() throws RecognitionException {
		try {
			int _type = COMMENT2;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:80:10: ( '/*' ( options {greedy=false; } : . )* '*/' )
			// test1.g:80:12: '/*' ( options {greedy=false; } : . )* '*/'
			{
			match("/*"); 

			// test1.g:80:17: ( options {greedy=false; } : . )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0=='*') ) {
					int LA14_1 = input.LA(2);
					if ( (LA14_1=='/') ) {
						alt14=2;
					}
					else if ( ((LA14_1 >= '\u0000' && LA14_1 <= '.')||(LA14_1 >= '0' && LA14_1 <= '\uFFFF')) ) {
						alt14=1;
					}

				}
				else if ( ((LA14_0 >= '\u0000' && LA14_0 <= ')')||(LA14_0 >= '+' && LA14_0 <= '\uFFFF')) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// test1.g:80:42: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop14;
				}
			}

			match("*/"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT2"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// test1.g:82:17: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
			// test1.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// test1.g:83:16: ( '0' .. '9' )
			// test1.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:86:5: ( ( ' ' | '\\r' | '\\t' )+ )
			// test1.g:86:7: ( ' ' | '\\r' | '\\t' )+
			{
			// test1.g:86:7: ( ' ' | '\\r' | '\\t' )+
			int cnt15=0;
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0=='\t'||LA15_0=='\r'||LA15_0==' ') ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// test1.g:
					{
					if ( input.LA(1)=='\t'||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt15 >= 1 ) break loop15;
					EarlyExitException eee = new EarlyExitException(15, input);
					throw eee;
				}
				cnt15++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// test1.g:1:8: ( INT_TYPE | CHAR_TYPE | VOID_TYPE | FLOAT_TYPE | WHILE_ | SWITCH_ | CASE_ | BREAK_ | RETURN_ | DEFUALT_ | EQ_OP | LE_OP | GE_OP | NE_OP | PP_OP | MM_OP | RSHIFT_OP | LSHIFT_OP | ANDAND_OP | INDICA_OP | NEW_LINE | HASHTAG | LINE_BREAK | IND_VAR | HEADER | ADD_OP | DEC_OP | MUL_OP | DIV_OP | EQU_OP | MOD_OP | LES_OP | GRT_OP | ESP_OP | LPAR_OP | RPAR_OP | LCUR_OP | RCUR_OP | LBAR_OP | RBAR_OP | SEMICOL_OP | COLON_OP | COMMA_OP | DMARK_OP | QMARK_OP | DEC_NUM | ID | SEN | FLOAT_NUM | COMMENT1 | COMMENT2 | WS )
		int alt16=52;
		alt16 = dfa16.predict(input);
		switch (alt16) {
			case 1 :
				// test1.g:1:10: INT_TYPE
				{
				mINT_TYPE(); 

				}
				break;
			case 2 :
				// test1.g:1:19: CHAR_TYPE
				{
				mCHAR_TYPE(); 

				}
				break;
			case 3 :
				// test1.g:1:29: VOID_TYPE
				{
				mVOID_TYPE(); 

				}
				break;
			case 4 :
				// test1.g:1:39: FLOAT_TYPE
				{
				mFLOAT_TYPE(); 

				}
				break;
			case 5 :
				// test1.g:1:50: WHILE_
				{
				mWHILE_(); 

				}
				break;
			case 6 :
				// test1.g:1:57: SWITCH_
				{
				mSWITCH_(); 

				}
				break;
			case 7 :
				// test1.g:1:65: CASE_
				{
				mCASE_(); 

				}
				break;
			case 8 :
				// test1.g:1:71: BREAK_
				{
				mBREAK_(); 

				}
				break;
			case 9 :
				// test1.g:1:78: RETURN_
				{
				mRETURN_(); 

				}
				break;
			case 10 :
				// test1.g:1:86: DEFUALT_
				{
				mDEFUALT_(); 

				}
				break;
			case 11 :
				// test1.g:1:95: EQ_OP
				{
				mEQ_OP(); 

				}
				break;
			case 12 :
				// test1.g:1:101: LE_OP
				{
				mLE_OP(); 

				}
				break;
			case 13 :
				// test1.g:1:107: GE_OP
				{
				mGE_OP(); 

				}
				break;
			case 14 :
				// test1.g:1:113: NE_OP
				{
				mNE_OP(); 

				}
				break;
			case 15 :
				// test1.g:1:119: PP_OP
				{
				mPP_OP(); 

				}
				break;
			case 16 :
				// test1.g:1:125: MM_OP
				{
				mMM_OP(); 

				}
				break;
			case 17 :
				// test1.g:1:131: RSHIFT_OP
				{
				mRSHIFT_OP(); 

				}
				break;
			case 18 :
				// test1.g:1:141: LSHIFT_OP
				{
				mLSHIFT_OP(); 

				}
				break;
			case 19 :
				// test1.g:1:151: ANDAND_OP
				{
				mANDAND_OP(); 

				}
				break;
			case 20 :
				// test1.g:1:161: INDICA_OP
				{
				mINDICA_OP(); 

				}
				break;
			case 21 :
				// test1.g:1:171: NEW_LINE
				{
				mNEW_LINE(); 

				}
				break;
			case 22 :
				// test1.g:1:180: HASHTAG
				{
				mHASHTAG(); 

				}
				break;
			case 23 :
				// test1.g:1:188: LINE_BREAK
				{
				mLINE_BREAK(); 

				}
				break;
			case 24 :
				// test1.g:1:199: IND_VAR
				{
				mIND_VAR(); 

				}
				break;
			case 25 :
				// test1.g:1:207: HEADER
				{
				mHEADER(); 

				}
				break;
			case 26 :
				// test1.g:1:214: ADD_OP
				{
				mADD_OP(); 

				}
				break;
			case 27 :
				// test1.g:1:221: DEC_OP
				{
				mDEC_OP(); 

				}
				break;
			case 28 :
				// test1.g:1:228: MUL_OP
				{
				mMUL_OP(); 

				}
				break;
			case 29 :
				// test1.g:1:235: DIV_OP
				{
				mDIV_OP(); 

				}
				break;
			case 30 :
				// test1.g:1:242: EQU_OP
				{
				mEQU_OP(); 

				}
				break;
			case 31 :
				// test1.g:1:249: MOD_OP
				{
				mMOD_OP(); 

				}
				break;
			case 32 :
				// test1.g:1:256: LES_OP
				{
				mLES_OP(); 

				}
				break;
			case 33 :
				// test1.g:1:263: GRT_OP
				{
				mGRT_OP(); 

				}
				break;
			case 34 :
				// test1.g:1:270: ESP_OP
				{
				mESP_OP(); 

				}
				break;
			case 35 :
				// test1.g:1:277: LPAR_OP
				{
				mLPAR_OP(); 

				}
				break;
			case 36 :
				// test1.g:1:285: RPAR_OP
				{
				mRPAR_OP(); 

				}
				break;
			case 37 :
				// test1.g:1:293: LCUR_OP
				{
				mLCUR_OP(); 

				}
				break;
			case 38 :
				// test1.g:1:301: RCUR_OP
				{
				mRCUR_OP(); 

				}
				break;
			case 39 :
				// test1.g:1:309: LBAR_OP
				{
				mLBAR_OP(); 

				}
				break;
			case 40 :
				// test1.g:1:317: RBAR_OP
				{
				mRBAR_OP(); 

				}
				break;
			case 41 :
				// test1.g:1:325: SEMICOL_OP
				{
				mSEMICOL_OP(); 

				}
				break;
			case 42 :
				// test1.g:1:336: COLON_OP
				{
				mCOLON_OP(); 

				}
				break;
			case 43 :
				// test1.g:1:345: COMMA_OP
				{
				mCOMMA_OP(); 

				}
				break;
			case 44 :
				// test1.g:1:354: DMARK_OP
				{
				mDMARK_OP(); 

				}
				break;
			case 45 :
				// test1.g:1:363: QMARK_OP
				{
				mQMARK_OP(); 

				}
				break;
			case 46 :
				// test1.g:1:372: DEC_NUM
				{
				mDEC_NUM(); 

				}
				break;
			case 47 :
				// test1.g:1:380: ID
				{
				mID(); 

				}
				break;
			case 48 :
				// test1.g:1:383: SEN
				{
				mSEN(); 

				}
				break;
			case 49 :
				// test1.g:1:387: FLOAT_NUM
				{
				mFLOAT_NUM(); 

				}
				break;
			case 50 :
				// test1.g:1:397: COMMENT1
				{
				mCOMMENT1(); 

				}
				break;
			case 51 :
				// test1.g:1:406: COMMENT2
				{
				mCOMMENT2(); 

				}
				break;
			case 52 :
				// test1.g:1:415: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA8 dfa8 = new DFA8(this);
	protected DFA16 dfa16 = new DFA16(this);
	static final String DFA8_eotS =
		"\1\uffff\1\4\3\uffff";
	static final String DFA8_eofS =
		"\5\uffff";
	static final String DFA8_minS =
		"\2\56\3\uffff";
	static final String DFA8_maxS =
		"\2\71\3\uffff";
	static final String DFA8_acceptS =
		"\2\uffff\1\2\1\1\1\3";
	static final String DFA8_specialS =
		"\5\uffff}>";
	static final String[] DFA8_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\3\1\uffff\12\1",
			"",
			"",
			""
	};

	static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
	static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
	static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
	static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
	static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
	static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
	static final short[][] DFA8_transition;

	static {
		int numStates = DFA8_transitionS.length;
		DFA8_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
		}
	}

	protected class DFA8 extends DFA {

		public DFA8(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 8;
			this.eot = DFA8_eot;
			this.eof = DFA8_eof;
			this.min = DFA8_min;
			this.max = DFA8_max;
			this.accept = DFA8_accept;
			this.special = DFA8_special;
			this.transition = DFA8_transition;
		}
		@Override
		public String getDescription() {
			return "72:1: FLOAT_NUM : ( FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3 );";
		}
	}

	static final String DFA16_eotS =
		"\1\uffff\11\52\1\65\1\70\1\73\1\uffff\1\75\1\100\1\102\3\uffff\1\104\1"+
		"\52\1\107\12\uffff\1\110\1\112\2\113\2\uffff\2\52\2\uffff\11\52\30\uffff"+
		"\1\113\1\127\11\52\1\uffff\1\141\1\142\1\143\6\52\3\uffff\1\152\1\153"+
		"\1\52\1\155\2\52\2\uffff\1\160\1\uffff\1\161\1\52\2\uffff\1\163\1\uffff";
	static final String DFA16_eofS =
		"\164\uffff";
	static final String DFA16_minS =
		"\1\11\11\56\1\75\1\74\1\75\1\uffff\1\53\1\55\1\46\3\uffff\1\101\1\56\1"+
		"\52\12\uffff\2\0\2\56\2\uffff\2\56\2\uffff\11\56\30\uffff\13\56\1\uffff"+
		"\11\56\3\uffff\6\56\2\uffff\1\56\1\uffff\2\56\2\uffff\1\56\1\uffff";
	static final String DFA16_maxS =
		"\1\175\11\172\2\75\1\76\1\uffff\1\53\1\76\1\46\3\uffff\2\172\1\57\12\uffff"+
		"\2\uffff\2\71\2\uffff\2\172\2\uffff\11\172\30\uffff\1\71\12\172\1\uffff"+
		"\11\172\3\uffff\6\172\2\uffff\1\172\1\uffff\2\172\2\uffff\1\172\1\uffff";
	static final String DFA16_acceptS =
		"\15\uffff\1\16\3\uffff\1\25\1\26\1\27\3\uffff\1\37\1\43\1\44\1\45\1\46"+
		"\1\47\1\50\1\51\1\52\1\53\4\uffff\1\61\1\64\2\uffff\1\31\1\57\11\uffff"+
		"\1\13\1\36\1\14\1\21\1\40\1\15\1\22\1\41\1\17\1\32\1\20\1\24\1\33\1\23"+
		"\1\42\1\30\1\34\1\62\1\63\1\35\1\54\1\60\1\55\1\56\13\uffff\1\1\11\uffff"+
		"\1\2\1\7\1\3\6\uffff\1\4\1\5\1\uffff\1\10\2\uffff\1\6\1\11\1\uffff\1\12";
	static final String DFA16_specialS =
		"\41\uffff\1\0\1\1\121\uffff}>";
	static final String[] DFA16_transitionS = {
			"\1\46\1\21\2\uffff\1\46\22\uffff\1\46\1\15\1\41\1\22\1\uffff\1\27\1\20"+
			"\1\42\1\30\1\31\1\24\1\16\1\40\1\17\1\45\1\26\1\43\11\44\1\37\1\36\1"+
			"\13\1\12\1\14\2\uffff\32\25\1\34\1\23\1\35\1\uffff\1\25\1\uffff\1\25"+
			"\1\7\1\2\1\11\1\25\1\4\2\25\1\1\10\25\1\10\1\6\2\25\1\3\1\5\3\25\1\32"+
			"\1\uffff\1\33",
			"\1\51\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\15\50\1\47\14"+
			"\50",
			"\1\51\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\1\54\6\50\1\53"+
			"\22\50",
			"\1\51\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\16\50\1\55\13"+
			"\50",
			"\1\51\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\13\50\1\56\16"+
			"\50",
			"\1\51\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\7\50\1\57\22"+
			"\50",
			"\1\51\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\26\50\1\60\3"+
			"\50",
			"\1\51\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\21\50\1\61\10"+
			"\50",
			"\1\51\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\4\50\1\62\25"+
			"\50",
			"\1\51\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\4\50\1\63\25"+
			"\50",
			"\1\64",
			"\1\67\1\66",
			"\1\71\1\72",
			"",
			"\1\74",
			"\1\76\20\uffff\1\77",
			"\1\101",
			"",
			"",
			"",
			"\32\103\4\uffff\1\103\1\uffff\32\103",
			"\1\51\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\106\4\uffff\1\105",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\0\111",
			"\0\111",
			"\1\45\1\uffff\12\45",
			"\1\45\1\uffff\12\114",
			"",
			"",
			"\1\51\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\23\50\1\115\6"+
			"\50",
			"\1\51\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"",
			"",
			"\1\51\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\1\116\31\50",
			"\1\51\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\22\50\1\117\7"+
			"\50",
			"\1\51\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\10\50\1\120\21"+
			"\50",
			"\1\51\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\16\50\1\121\13"+
			"\50",
			"\1\51\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\10\50\1\122\21"+
			"\50",
			"\1\51\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\10\50\1\123\21"+
			"\50",
			"\1\51\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\4\50\1\124\25"+
			"\50",
			"\1\51\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\23\50\1\125\6"+
			"\50",
			"\1\51\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\5\50\1\126\24"+
			"\50",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\45\1\uffff\12\114",
			"\1\51\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\51\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\21\50\1\130\10"+
			"\50",
			"\1\51\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\4\50\1\131\25"+
			"\50",
			"\1\51\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\3\50\1\132\26"+
			"\50",
			"\1\51\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\1\133\31\50",
			"\1\51\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\13\50\1\134\16"+
			"\50",
			"\1\51\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\23\50\1\135\6"+
			"\50",
			"\1\51\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\1\136\31\50",
			"\1\51\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\24\50\1\137\5"+
			"\50",
			"\1\51\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\1\140\31\50",
			"",
			"\1\51\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\51\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\51\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\51\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\23\50\1\144\6"+
			"\50",
			"\1\51\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\4\50\1\145\25"+
			"\50",
			"\1\51\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\2\50\1\146\27"+
			"\50",
			"\1\51\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\12\50\1\147\17"+
			"\50",
			"\1\51\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\21\50\1\150\10"+
			"\50",
			"\1\51\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\24\50\1\151\5"+
			"\50",
			"",
			"",
			"",
			"\1\51\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\51\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\51\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\7\50\1\154\22"+
			"\50",
			"\1\51\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\51\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\15\50\1\156\14"+
			"\50",
			"\1\51\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\13\50\1\157\16"+
			"\50",
			"",
			"",
			"\1\51\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"",
			"\1\51\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\51\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\23\50\1\162\6"+
			"\50",
			"",
			"",
			"\1\51\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			""
	};

	static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
	static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
	static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
	static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
	static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
	static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
	static final short[][] DFA16_transition;

	static {
		int numStates = DFA16_transitionS.length;
		DFA16_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
		}
	}

	protected class DFA16 extends DFA {

		public DFA16(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 16;
			this.eot = DFA16_eot;
			this.eof = DFA16_eof;
			this.min = DFA16_min;
			this.max = DFA16_max;
			this.accept = DFA16_accept;
			this.special = DFA16_special;
			this.transition = DFA16_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( INT_TYPE | CHAR_TYPE | VOID_TYPE | FLOAT_TYPE | WHILE_ | SWITCH_ | CASE_ | BREAK_ | RETURN_ | DEFUALT_ | EQ_OP | LE_OP | GE_OP | NE_OP | PP_OP | MM_OP | RSHIFT_OP | LSHIFT_OP | ANDAND_OP | INDICA_OP | NEW_LINE | HASHTAG | LINE_BREAK | IND_VAR | HEADER | ADD_OP | DEC_OP | MUL_OP | DIV_OP | EQU_OP | MOD_OP | LES_OP | GRT_OP | ESP_OP | LPAR_OP | RPAR_OP | LCUR_OP | RCUR_OP | LBAR_OP | RBAR_OP | SEMICOL_OP | COLON_OP | COMMA_OP | DMARK_OP | QMARK_OP | DEC_NUM | ID | SEN | FLOAT_NUM | COMMENT1 | COMMENT2 | WS );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA16_33 = input.LA(1);
						s = -1;
						if ( ((LA16_33 >= '\u0000' && LA16_33 <= '\uFFFF')) ) {s = 73;}
						else s = 72;
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA16_34 = input.LA(1);
						s = -1;
						if ( ((LA16_34 >= '\u0000' && LA16_34 <= '\uFFFF')) ) {s = 73;}
						else s = 74;
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 16, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
