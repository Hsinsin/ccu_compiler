// $ANTLR 3.5.2 mylexer.g 2022-03-26 19:37:02

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class mylexer extends Lexer {
	public static final int EOF=-1;
	public static final int ADD_OP=4;
	public static final int ANDAND_OP=5;
	public static final int ANDEUQ_OP=6;
	public static final int AUTO_TYPE=7;
	public static final int BOOL_TYPE=8;
	public static final int BOO_OP=9;
	public static final int BREAK_=10;
	public static final int CASE_=11;
	public static final int CHAR_TYPE=12;
	public static final int COLON_OP=13;
	public static final int COMMA_OP=14;
	public static final int COMMENT1=15;
	public static final int COMMENT2=16;
	public static final int CONST_=17;
	public static final int CONTINUE_=18;
	public static final int DECEQU_OP=19;
	public static final int DEC_NUM=20;
	public static final int DEC_OP=21;
	public static final int DEFINE_=22;
	public static final int DEFUALT_=23;
	public static final int DIGIT=24;
	public static final int DIVEQU_OP=25;
	public static final int DIV_OP=26;
	public static final int DMARK_OP=27;
	public static final int DOUBL_TYPE=28;
	public static final int DOWHILE_=29;
	public static final int ELSEIF_=30;
	public static final int ELSE_=31;
	public static final int EQU_OP=32;
	public static final int EQ_OP=33;
	public static final int ESP_OP=34;
	public static final int EXTERN_=35;
	public static final int FGETS_=36;
	public static final int FLOAT_NUM=37;
	public static final int FLOAT_NUM1=38;
	public static final int FLOAT_NUM2=39;
	public static final int FLOAT_NUM3=40;
	public static final int FLOAT_TYPE=41;
	public static final int FOR_=42;
	public static final int FREE_=43;
	public static final int GE_OP=44;
	public static final int GRT_OP=45;
	public static final int HASHTAG=46;
	public static final int HEADER=47;
	public static final int ID=48;
	public static final int IF_=49;
	public static final int INCLUDE_=50;
	public static final int INDICA_OP=51;
	public static final int INDIND_VAR=52;
	public static final int IND_VAR=53;
	public static final int INT_TYPE=54;
	public static final int LBAR_OP=55;
	public static final int LCUR_OP=56;
	public static final int LES_OP=57;
	public static final int LETTER=58;
	public static final int LE_OP=59;
	public static final int LINE_BREAK=60;
	public static final int LLONG_TYPE=61;
	public static final int LONG_TYPE=62;
	public static final int LPAR_OP=63;
	public static final int LSHIFT_OP=64;
	public static final int MAIN_=65;
	public static final int MALLOC_=66;
	public static final int MM_OP=67;
	public static final int MOD_OP=68;
	public static final int MULEQU_OP=69;
	public static final int MUL_OP=70;
	public static final int NEW_LINE=71;
	public static final int NE_OP=72;
	public static final int ORR_OP=73;
	public static final int OR_OP=74;
	public static final int PP_OP=75;
	public static final int PRINTF_=76;
	public static final int QMARK_OP=77;
	public static final int RBAR_OP=78;
	public static final int RCUR_OP=79;
	public static final int RETURN_=80;
	public static final int RPAR_OP=81;
	public static final int RSHIFT_OP=82;
	public static final int SCNAF_=83;
	public static final int SEI_OP=84;
	public static final int SEMICOL_OP=85;
	public static final int SEN=86;
	public static final int SHORT_TYPE=87;
	public static final int SIGN_TYPE=88;
	public static final int STATIC_=89;
	public static final int STRCMP_=90;
	public static final int STRCSPN_=91;
	public static final int STRDUP_=92;
	public static final int STRLEN_=93;
	public static final int STRUC_TYPE=94;
	public static final int SWITCH_=95;
	public static final int TYPEDEF_=96;
	public static final int UNION_TYPE=97;
	public static final int USIGN_TYPE=98;
	public static final int VOID_TYPE=99;
	public static final int WHILE_=100;
	public static final int WS=101;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public mylexer() {} 
	public mylexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public mylexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "mylexer.g"; }

	// $ANTLR start "INCLUDE_"
	public final void mINCLUDE_() throws RecognitionException {
		try {
			int _type = INCLUDE_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:10:11: ( 'include' )
			// mylexer.g:10:13: 'include'
			{
			match("include"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INCLUDE_"

	// $ANTLR start "DEFINE_"
	public final void mDEFINE_() throws RecognitionException {
		try {
			int _type = DEFINE_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:11:11: ( 'define' )
			// mylexer.g:11:13: 'define'
			{
			match("define"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DEFINE_"

	// $ANTLR start "INT_TYPE"
	public final void mINT_TYPE() throws RecognitionException {
		try {
			int _type = INT_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:12:11: ( 'int' )
			// mylexer.g:12:13: 'int'
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
			// mylexer.g:13:11: ( 'char' )
			// mylexer.g:13:13: 'char'
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
			// mylexer.g:14:11: ( 'void' )
			// mylexer.g:14:13: 'void'
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

	// $ANTLR start "BOOL_TYPE"
	public final void mBOOL_TYPE() throws RecognitionException {
		try {
			int _type = BOOL_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:15:11: ( 'bool' )
			// mylexer.g:15:13: 'bool'
			{
			match("bool"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BOOL_TYPE"

	// $ANTLR start "AUTO_TYPE"
	public final void mAUTO_TYPE() throws RecognitionException {
		try {
			int _type = AUTO_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:16:11: ( 'auto' )
			// mylexer.g:16:13: 'auto'
			{
			match("auto"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AUTO_TYPE"

	// $ANTLR start "SIGN_TYPE"
	public final void mSIGN_TYPE() throws RecognitionException {
		try {
			int _type = SIGN_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:17:11: ( 'signed' )
			// mylexer.g:17:13: 'signed'
			{
			match("signed"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SIGN_TYPE"

	// $ANTLR start "USIGN_TYPE"
	public final void mUSIGN_TYPE() throws RecognitionException {
		try {
			int _type = USIGN_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:18:11: ( 'unsigned' )
			// mylexer.g:18:13: 'unsigned'
			{
			match("unsigned"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "USIGN_TYPE"

	// $ANTLR start "UNION_TYPE"
	public final void mUNION_TYPE() throws RecognitionException {
		try {
			int _type = UNION_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:19:11: ( 'union' )
			// mylexer.g:19:13: 'union'
			{
			match("union"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNION_TYPE"

	// $ANTLR start "SHORT_TYPE"
	public final void mSHORT_TYPE() throws RecognitionException {
		try {
			int _type = SHORT_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:20:11: ( 'short' )
			// mylexer.g:20:13: 'short'
			{
			match("short"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SHORT_TYPE"

	// $ANTLR start "FLOAT_TYPE"
	public final void mFLOAT_TYPE() throws RecognitionException {
		try {
			int _type = FLOAT_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:21:11: ( 'float' )
			// mylexer.g:21:13: 'float'
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

	// $ANTLR start "DOUBL_TYPE"
	public final void mDOUBL_TYPE() throws RecognitionException {
		try {
			int _type = DOUBL_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:22:11: ( 'double' )
			// mylexer.g:22:13: 'double'
			{
			match("double"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOUBL_TYPE"

	// $ANTLR start "LONG_TYPE"
	public final void mLONG_TYPE() throws RecognitionException {
		try {
			int _type = LONG_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:23:11: ( 'long' )
			// mylexer.g:23:13: 'long'
			{
			match("long"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LONG_TYPE"

	// $ANTLR start "LLONG_TYPE"
	public final void mLLONG_TYPE() throws RecognitionException {
		try {
			int _type = LLONG_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:24:11: ( 'long long' )
			// mylexer.g:24:13: 'long long'
			{
			match("long long"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LLONG_TYPE"

	// $ANTLR start "STRUC_TYPE"
	public final void mSTRUC_TYPE() throws RecognitionException {
		try {
			int _type = STRUC_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:25:11: ( 'struct' )
			// mylexer.g:25:13: 'struct'
			{
			match("struct"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRUC_TYPE"

	// $ANTLR start "TYPEDEF_"
	public final void mTYPEDEF_() throws RecognitionException {
		try {
			int _type = TYPEDEF_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:26:11: ( 'typedef' )
			// mylexer.g:26:13: 'typedef'
			{
			match("typedef"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TYPEDEF_"

	// $ANTLR start "STATIC_"
	public final void mSTATIC_() throws RecognitionException {
		try {
			int _type = STATIC_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:27:11: ( 'static' )
			// mylexer.g:27:13: 'static'
			{
			match("static"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STATIC_"

	// $ANTLR start "EXTERN_"
	public final void mEXTERN_() throws RecognitionException {
		try {
			int _type = EXTERN_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:28:11: ( 'extern' )
			// mylexer.g:28:13: 'extern'
			{
			match("extern"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXTERN_"

	// $ANTLR start "WHILE_"
	public final void mWHILE_() throws RecognitionException {
		try {
			int _type = WHILE_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:29:11: ( 'while' )
			// mylexer.g:29:13: 'while'
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
			// mylexer.g:30:11: ( 'switch' )
			// mylexer.g:30:13: 'switch'
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
			// mylexer.g:31:11: ( 'case' )
			// mylexer.g:31:13: 'case'
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
			// mylexer.g:32:11: ( 'break' )
			// mylexer.g:32:13: 'break'
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
			// mylexer.g:33:11: ( 'return' )
			// mylexer.g:33:13: 'return'
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
			// mylexer.g:34:11: ( 'default' )
			// mylexer.g:34:13: 'default'
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

	// $ANTLR start "CONST_"
	public final void mCONST_() throws RecognitionException {
		try {
			int _type = CONST_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:35:11: ( 'const' )
			// mylexer.g:35:13: 'const'
			{
			match("const"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONST_"

	// $ANTLR start "FOR_"
	public final void mFOR_() throws RecognitionException {
		try {
			int _type = FOR_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:36:11: ( 'for' )
			// mylexer.g:36:13: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FOR_"

	// $ANTLR start "IF_"
	public final void mIF_() throws RecognitionException {
		try {
			int _type = IF_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:37:11: ( 'if' )
			// mylexer.g:37:13: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF_"

	// $ANTLR start "ELSE_"
	public final void mELSE_() throws RecognitionException {
		try {
			int _type = ELSE_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:38:11: ( 'else' )
			// mylexer.g:38:13: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE_"

	// $ANTLR start "ELSEIF_"
	public final void mELSEIF_() throws RecognitionException {
		try {
			int _type = ELSEIF_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:39:11: ( 'else if' )
			// mylexer.g:39:13: 'else if'
			{
			match("else if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSEIF_"

	// $ANTLR start "CONTINUE_"
	public final void mCONTINUE_() throws RecognitionException {
		try {
			int _type = CONTINUE_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:40:11: ( 'continue' )
			// mylexer.g:40:13: 'continue'
			{
			match("continue"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONTINUE_"

	// $ANTLR start "DOWHILE_"
	public final void mDOWHILE_() throws RecognitionException {
		try {
			int _type = DOWHILE_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:41:11: ( ( 'do' ) ( '{' ( options {greedy=false; } : . )* '}' ) ( WHILE_ ) )
			// mylexer.g:41:13: ( 'do' ) ( '{' ( options {greedy=false; } : . )* '}' ) ( WHILE_ )
			{
			// mylexer.g:41:13: ( 'do' )
			// mylexer.g:41:14: 'do'
			{
			match("do"); 

			}

			// mylexer.g:41:19: ( '{' ( options {greedy=false; } : . )* '}' )
			// mylexer.g:41:20: '{' ( options {greedy=false; } : . )* '}'
			{
			match('{'); 
			// mylexer.g:41:24: ( options {greedy=false; } : . )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0=='}') ) {
					int LA1_1 = input.LA(2);
					if ( (LA1_1=='w') ) {
						int LA1_3 = input.LA(3);
						if ( (LA1_3=='h') ) {
							int LA1_4 = input.LA(4);
							if ( (LA1_4=='i') ) {
								int LA1_5 = input.LA(5);
								if ( (LA1_5=='l') ) {
									int LA1_6 = input.LA(6);
									if ( (LA1_6=='e') ) {
										alt1=2;
									}
									else if ( ((LA1_6 >= '\u0000' && LA1_6 <= 'd')||(LA1_6 >= 'f' && LA1_6 <= '\uFFFF')) ) {
										alt1=1;
									}

								}
								else if ( ((LA1_5 >= '\u0000' && LA1_5 <= 'k')||(LA1_5 >= 'm' && LA1_5 <= '\uFFFF')) ) {
									alt1=1;
								}

							}
							else if ( ((LA1_4 >= '\u0000' && LA1_4 <= 'h')||(LA1_4 >= 'j' && LA1_4 <= '\uFFFF')) ) {
								alt1=1;
							}

						}
						else if ( ((LA1_3 >= '\u0000' && LA1_3 <= 'g')||(LA1_3 >= 'i' && LA1_3 <= '\uFFFF')) ) {
							alt1=1;
						}

					}
					else if ( ((LA1_1 >= '\u0000' && LA1_1 <= 'v')||(LA1_1 >= 'x' && LA1_1 <= '\uFFFF')) ) {
						alt1=1;
					}

				}
				else if ( ((LA1_0 >= '\u0000' && LA1_0 <= '|')||(LA1_0 >= '~' && LA1_0 <= '\uFFFF')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// mylexer.g:41:49: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop1;
				}
			}

			match('}'); 
			}

			// mylexer.g:41:57: ( WHILE_ )
			// mylexer.g:41:58: WHILE_
			{
			mWHILE_(); 

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOWHILE_"

	// $ANTLR start "EQ_OP"
	public final void mEQ_OP() throws RecognitionException {
		try {
			int _type = EQ_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:47:7: ( '==' )
			// mylexer.g:47:9: '=='
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
			// mylexer.g:48:7: ( '<=' )
			// mylexer.g:48:9: '<='
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
			// mylexer.g:49:7: ( '>=' )
			// mylexer.g:49:9: '>='
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
			// mylexer.g:50:7: ( '!=' )
			// mylexer.g:50:9: '!='
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
			// mylexer.g:51:7: ( '++' )
			// mylexer.g:51:9: '++'
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
			// mylexer.g:52:7: ( '--' )
			// mylexer.g:52:9: '--'
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

	// $ANTLR start "OR_OP"
	public final void mOR_OP() throws RecognitionException {
		try {
			int _type = OR_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:53:7: ( '||' )
			// mylexer.g:53:9: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR_OP"

	// $ANTLR start "ANDEUQ_OP"
	public final void mANDEUQ_OP() throws RecognitionException {
		try {
			int _type = ANDEUQ_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:54:11: ( '+=' )
			// mylexer.g:54:13: '+='
			{
			match("+="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ANDEUQ_OP"

	// $ANTLR start "DECEQU_OP"
	public final void mDECEQU_OP() throws RecognitionException {
		try {
			int _type = DECEQU_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:55:11: ( '-=' )
			// mylexer.g:55:13: '-='
			{
			match("-="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DECEQU_OP"

	// $ANTLR start "MULEQU_OP"
	public final void mMULEQU_OP() throws RecognitionException {
		try {
			int _type = MULEQU_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:56:11: ( '*=' )
			// mylexer.g:56:13: '*='
			{
			match("*="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MULEQU_OP"

	// $ANTLR start "DIVEQU_OP"
	public final void mDIVEQU_OP() throws RecognitionException {
		try {
			int _type = DIVEQU_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:57:11: ( '/=' )
			// mylexer.g:57:13: '/='
			{
			match("/="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIVEQU_OP"

	// $ANTLR start "RSHIFT_OP"
	public final void mRSHIFT_OP() throws RecognitionException {
		try {
			int _type = RSHIFT_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:58:11: ( '<<' )
			// mylexer.g:58:13: '<<'
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
			// mylexer.g:59:11: ( '>>' )
			// mylexer.g:59:13: '>>'
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
			// mylexer.g:60:11: ( '&&' )
			// mylexer.g:60:13: '&&'
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
			// mylexer.g:61:11: ( '->' )
			// mylexer.g:61:13: '->'
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
			// mylexer.g:63:14: ( '\\n' )
			// mylexer.g:63:16: '\\n'
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
			// mylexer.g:64:14: ( '#' )
			// mylexer.g:64:16: '#'
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
			// mylexer.g:65:14: ( ( '\\\\n' ) )
			// mylexer.g:65:16: ( '\\\\n' )
			{
			// mylexer.g:65:16: ( '\\\\n' )
			// mylexer.g:65:17: '\\\\n'
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
			// mylexer.g:66:14: ( ( '*' ) ( ID ) )
			// mylexer.g:66:16: ( '*' ) ( ID )
			{
			// mylexer.g:66:16: ( '*' )
			// mylexer.g:66:17: '*'
			{
			match('*'); 
			}

			// mylexer.g:66:21: ( ID )
			// mylexer.g:66:22: ID
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

	// $ANTLR start "INDIND_VAR"
	public final void mINDIND_VAR() throws RecognitionException {
		try {
			int _type = INDIND_VAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:67:14: ( ( '*' ) ( '*' ) ( ID ) )
			// mylexer.g:67:16: ( '*' ) ( '*' ) ( ID )
			{
			// mylexer.g:67:16: ( '*' )
			// mylexer.g:67:17: '*'
			{
			match('*'); 
			}

			// mylexer.g:67:21: ( '*' )
			// mylexer.g:67:22: '*'
			{
			match('*'); 
			}

			// mylexer.g:67:26: ( ID )
			// mylexer.g:67:27: ID
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
	// $ANTLR end "INDIND_VAR"

	// $ANTLR start "HEADER"
	public final void mHEADER() throws RecognitionException {
		try {
			int _type = HEADER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:68:14: ( ( LETTER ) ( LETTER | DIGIT )* ( '.' ) ( LETTER ) )
			// mylexer.g:68:16: ( LETTER ) ( LETTER | DIGIT )* ( '.' ) ( LETTER )
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// mylexer.g:68:24: ( LETTER | DIGIT )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// mylexer.g:
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
					break loop2;
				}
			}

			// mylexer.g:68:41: ( '.' )
			// mylexer.g:68:42: '.'
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
			// mylexer.g:74:8: ( '+' )
			// mylexer.g:74:10: '+'
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
			// mylexer.g:75:8: ( '-' )
			// mylexer.g:75:10: '-'
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
			// mylexer.g:76:8: ( '*' )
			// mylexer.g:76:10: '*'
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
			// mylexer.g:77:8: ( '/' )
			// mylexer.g:77:10: '/'
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
			// mylexer.g:78:8: ( '=' )
			// mylexer.g:78:10: '='
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
			// mylexer.g:79:8: ( '%' )
			// mylexer.g:79:10: '%'
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
			// mylexer.g:80:8: ( '<' )
			// mylexer.g:80:10: '<'
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
			// mylexer.g:81:8: ( '>' )
			// mylexer.g:81:10: '>'
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
			// mylexer.g:82:8: ( '&' )
			// mylexer.g:82:10: '&'
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

	// $ANTLR start "BOO_OP"
	public final void mBOO_OP() throws RecognitionException {
		try {
			int _type = BOO_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:83:8: ( '~' )
			// mylexer.g:83:10: '~'
			{
			match('~'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BOO_OP"

	// $ANTLR start "SEI_OP"
	public final void mSEI_OP() throws RecognitionException {
		try {
			int _type = SEI_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:84:8: ( '!' )
			// mylexer.g:84:10: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEI_OP"

	// $ANTLR start "ORR_OP"
	public final void mORR_OP() throws RecognitionException {
		try {
			int _type = ORR_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:85:8: ( '|' )
			// mylexer.g:85:10: '|'
			{
			match('|'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ORR_OP"

	// $ANTLR start "LPAR_OP"
	public final void mLPAR_OP() throws RecognitionException {
		try {
			int _type = LPAR_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:86:9: ( '(' )
			// mylexer.g:86:11: '('
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
			// mylexer.g:87:9: ( ')' )
			// mylexer.g:87:11: ')'
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
			// mylexer.g:88:9: ( '{' )
			// mylexer.g:88:11: '{'
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
			// mylexer.g:89:9: ( '}' )
			// mylexer.g:89:11: '}'
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
			// mylexer.g:90:9: ( '[' )
			// mylexer.g:90:11: '['
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
			// mylexer.g:91:9: ( ']' )
			// mylexer.g:91:11: ']'
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
			// mylexer.g:92:12: ( ';' )
			// mylexer.g:92:14: ';'
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
			// mylexer.g:93:12: ( ':' )
			// mylexer.g:93:14: ':'
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
			// mylexer.g:94:12: ( ',' )
			// mylexer.g:94:14: ','
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
			// mylexer.g:95:12: ( '\\\"' )
			// mylexer.g:95:14: '\\\"'
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
			// mylexer.g:96:12: ( '\\'' )
			// mylexer.g:96:14: '\\''
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

	// $ANTLR start "MAIN_"
	public final void mMAIN_() throws RecognitionException {
		try {
			int _type = MAIN_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:98:12: ( 'main' )
			// mylexer.g:98:14: 'main'
			{
			match("main"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MAIN_"

	// $ANTLR start "PRINTF_"
	public final void mPRINTF_() throws RecognitionException {
		try {
			int _type = PRINTF_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:99:12: ( 'printf' )
			// mylexer.g:99:14: 'printf'
			{
			match("printf"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PRINTF_"

	// $ANTLR start "SCNAF_"
	public final void mSCNAF_() throws RecognitionException {
		try {
			int _type = SCNAF_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:100:12: ( 'scanf' )
			// mylexer.g:100:14: 'scanf'
			{
			match("scanf"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SCNAF_"

	// $ANTLR start "FGETS_"
	public final void mFGETS_() throws RecognitionException {
		try {
			int _type = FGETS_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:101:12: ( 'fgets' )
			// mylexer.g:101:14: 'fgets'
			{
			match("fgets"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FGETS_"

	// $ANTLR start "STRLEN_"
	public final void mSTRLEN_() throws RecognitionException {
		try {
			int _type = STRLEN_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:102:12: ( 'strlen' )
			// mylexer.g:102:14: 'strlen'
			{
			match("strlen"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRLEN_"

	// $ANTLR start "STRCSPN_"
	public final void mSTRCSPN_() throws RecognitionException {
		try {
			int _type = STRCSPN_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:103:12: ( 'strcspn' )
			// mylexer.g:103:14: 'strcspn'
			{
			match("strcspn"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRCSPN_"

	// $ANTLR start "MALLOC_"
	public final void mMALLOC_() throws RecognitionException {
		try {
			int _type = MALLOC_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:104:12: ( 'malloc' )
			// mylexer.g:104:14: 'malloc'
			{
			match("malloc"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MALLOC_"

	// $ANTLR start "STRDUP_"
	public final void mSTRDUP_() throws RecognitionException {
		try {
			int _type = STRDUP_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:105:12: ( 'strdup' )
			// mylexer.g:105:14: 'strdup'
			{
			match("strdup"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRDUP_"

	// $ANTLR start "STRCMP_"
	public final void mSTRCMP_() throws RecognitionException {
		try {
			int _type = STRCMP_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:106:12: ( 'strcmp' )
			// mylexer.g:106:14: 'strcmp'
			{
			match("strcmp"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRCMP_"

	// $ANTLR start "FREE_"
	public final void mFREE_() throws RecognitionException {
		try {
			int _type = FREE_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:107:12: ( 'free' )
			// mylexer.g:107:14: 'free'
			{
			match("free"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FREE_"

	// $ANTLR start "DEC_NUM"
	public final void mDEC_NUM() throws RecognitionException {
		try {
			int _type = DEC_NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:109:9: ( ( '0' | ( '1' .. '9' ) ( DIGIT )* ) )
			// mylexer.g:109:11: ( '0' | ( '1' .. '9' ) ( DIGIT )* )
			{
			// mylexer.g:109:11: ( '0' | ( '1' .. '9' ) ( DIGIT )* )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='0') ) {
				alt4=1;
			}
			else if ( ((LA4_0 >= '1' && LA4_0 <= '9')) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// mylexer.g:109:12: '0'
					{
					match('0'); 
					}
					break;
				case 2 :
					// mylexer.g:109:18: ( '1' .. '9' ) ( DIGIT )*
					{
					if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// mylexer.g:109:28: ( DIGIT )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// mylexer.g:
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
							break loop3;
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
			// mylexer.g:111:4: ( ( LETTER ) ( LETTER | DIGIT )* )
			// mylexer.g:111:6: ( LETTER ) ( LETTER | DIGIT )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// mylexer.g:111:14: ( LETTER | DIGIT )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '0' && LA5_0 <= '9')||(LA5_0 >= 'A' && LA5_0 <= 'Z')||LA5_0=='_'||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// mylexer.g:
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
					break loop5;
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
			// mylexer.g:112:5: ( ( ( '\\\"' ( options {greedy=false; } : . )* '\\\"' ) | ( '\\'' ( options {greedy=false; } : . )* '\\'' ) ) )
			// mylexer.g:112:7: ( ( '\\\"' ( options {greedy=false; } : . )* '\\\"' ) | ( '\\'' ( options {greedy=false; } : . )* '\\'' ) )
			{
			// mylexer.g:112:7: ( ( '\\\"' ( options {greedy=false; } : . )* '\\\"' ) | ( '\\'' ( options {greedy=false; } : . )* '\\'' ) )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='\"') ) {
				alt8=1;
			}
			else if ( (LA8_0=='\'') ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// mylexer.g:112:8: ( '\\\"' ( options {greedy=false; } : . )* '\\\"' )
					{
					// mylexer.g:112:8: ( '\\\"' ( options {greedy=false; } : . )* '\\\"' )
					// mylexer.g:112:9: '\\\"' ( options {greedy=false; } : . )* '\\\"'
					{
					match('\"'); 
					// mylexer.g:112:14: ( options {greedy=false; } : . )*
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0=='\"') ) {
							alt6=2;
						}
						else if ( ((LA6_0 >= '\u0000' && LA6_0 <= '!')||(LA6_0 >= '#' && LA6_0 <= '\uFFFF')) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// mylexer.g:112:39: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop6;
						}
					}

					match('\"'); 
					}

					}
					break;
				case 2 :
					// mylexer.g:112:51: ( '\\'' ( options {greedy=false; } : . )* '\\'' )
					{
					// mylexer.g:112:51: ( '\\'' ( options {greedy=false; } : . )* '\\'' )
					// mylexer.g:112:52: '\\'' ( options {greedy=false; } : . )* '\\''
					{
					match('\''); 
					// mylexer.g:112:57: ( options {greedy=false; } : . )*
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( (LA7_0=='\'') ) {
							alt7=2;
						}
						else if ( ((LA7_0 >= '\u0000' && LA7_0 <= '&')||(LA7_0 >= '(' && LA7_0 <= '\uFFFF')) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// mylexer.g:112:82: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop7;
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
			// mylexer.g:114:10: ( FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3 )
			int alt9=3;
			alt9 = dfa9.predict(input);
			switch (alt9) {
				case 1 :
					// mylexer.g:114:12: FLOAT_NUM1
					{
					mFLOAT_NUM1(); 

					}
					break;
				case 2 :
					// mylexer.g:114:25: FLOAT_NUM2
					{
					mFLOAT_NUM2(); 

					}
					break;
				case 3 :
					// mylexer.g:114:38: FLOAT_NUM3
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
			// mylexer.g:115:20: ( ( DIGIT )+ '.' ( DIGIT )* )
			// mylexer.g:115:22: ( DIGIT )+ '.' ( DIGIT )*
			{
			// mylexer.g:115:22: ( DIGIT )+
			int cnt10=0;
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( ((LA10_0 >= '0' && LA10_0 <= '9')) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// mylexer.g:
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
					if ( cnt10 >= 1 ) break loop10;
					EarlyExitException eee = new EarlyExitException(10, input);
					throw eee;
				}
				cnt10++;
			}

			match('.'); 
			// mylexer.g:115:33: ( DIGIT )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// mylexer.g:
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
					break loop11;
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
			// mylexer.g:116:20: ( '.' ( DIGIT )+ )
			// mylexer.g:116:22: '.' ( DIGIT )+
			{
			match('.'); 
			// mylexer.g:116:25: ( DIGIT )+
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
					// mylexer.g:
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
	// $ANTLR end "FLOAT_NUM2"

	// $ANTLR start "FLOAT_NUM3"
	public final void mFLOAT_NUM3() throws RecognitionException {
		try {
			// mylexer.g:117:20: ( ( DIGIT )+ )
			// mylexer.g:117:22: ( DIGIT )+
			{
			// mylexer.g:117:22: ( DIGIT )+
			int cnt13=0;
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( ((LA13_0 >= '0' && LA13_0 <= '9')) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// mylexer.g:
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
					if ( cnt13 >= 1 ) break loop13;
					EarlyExitException eee = new EarlyExitException(13, input);
					throw eee;
				}
				cnt13++;
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
			// mylexer.g:121:10: ( '//' ( . )* '\\n' )
			// mylexer.g:121:12: '//' ( . )* '\\n'
			{
			match("//"); 

			// mylexer.g:121:16: ( . )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0=='\n') ) {
					alt14=2;
				}
				else if ( ((LA14_0 >= '\u0000' && LA14_0 <= '\t')||(LA14_0 >= '\u000B' && LA14_0 <= '\uFFFF')) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// mylexer.g:121:17: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop14;
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
			// mylexer.g:122:10: ( '/*' ( options {greedy=false; } : . )* '*/' )
			// mylexer.g:122:12: '/*' ( options {greedy=false; } : . )* '*/'
			{
			match("/*"); 

			// mylexer.g:122:17: ( options {greedy=false; } : . )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0=='*') ) {
					int LA15_1 = input.LA(2);
					if ( (LA15_1=='/') ) {
						alt15=2;
					}
					else if ( ((LA15_1 >= '\u0000' && LA15_1 <= '.')||(LA15_1 >= '0' && LA15_1 <= '\uFFFF')) ) {
						alt15=1;
					}

				}
				else if ( ((LA15_0 >= '\u0000' && LA15_0 <= ')')||(LA15_0 >= '+' && LA15_0 <= '\uFFFF')) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// mylexer.g:122:42: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop15;
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
			// mylexer.g:124:17: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
			// mylexer.g:
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
			// mylexer.g:125:16: ( '0' .. '9' )
			// mylexer.g:
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
			// mylexer.g:127:5: ( ( ' ' | '\\r' | '\\t' )+ )
			// mylexer.g:127:7: ( ' ' | '\\r' | '\\t' )+
			{
			// mylexer.g:127:7: ( ' ' | '\\r' | '\\t' )+
			int cnt16=0;
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0=='\t'||LA16_0=='\r'||LA16_0==' ') ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// mylexer.g:
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
					if ( cnt16 >= 1 ) break loop16;
					EarlyExitException eee = new EarlyExitException(16, input);
					throw eee;
				}
				cnt16++;
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
		// mylexer.g:1:8: ( INCLUDE_ | DEFINE_ | INT_TYPE | CHAR_TYPE | VOID_TYPE | BOOL_TYPE | AUTO_TYPE | SIGN_TYPE | USIGN_TYPE | UNION_TYPE | SHORT_TYPE | FLOAT_TYPE | DOUBL_TYPE | LONG_TYPE | LLONG_TYPE | STRUC_TYPE | TYPEDEF_ | STATIC_ | EXTERN_ | WHILE_ | SWITCH_ | CASE_ | BREAK_ | RETURN_ | DEFUALT_ | CONST_ | FOR_ | IF_ | ELSE_ | ELSEIF_ | CONTINUE_ | DOWHILE_ | EQ_OP | LE_OP | GE_OP | NE_OP | PP_OP | MM_OP | OR_OP | ANDEUQ_OP | DECEQU_OP | MULEQU_OP | DIVEQU_OP | RSHIFT_OP | LSHIFT_OP | ANDAND_OP | INDICA_OP | NEW_LINE | HASHTAG | LINE_BREAK | IND_VAR | INDIND_VAR | HEADER | ADD_OP | DEC_OP | MUL_OP | DIV_OP | EQU_OP | MOD_OP | LES_OP | GRT_OP | ESP_OP | BOO_OP | SEI_OP | ORR_OP | LPAR_OP | RPAR_OP | LCUR_OP | RCUR_OP | LBAR_OP | RBAR_OP | SEMICOL_OP | COLON_OP | COMMA_OP | DMARK_OP | QMARK_OP | MAIN_ | PRINTF_ | SCNAF_ | FGETS_ | STRLEN_ | STRCSPN_ | MALLOC_ | STRDUP_ | STRCMP_ | FREE_ | DEC_NUM | ID | SEN | FLOAT_NUM | COMMENT1 | COMMENT2 | WS )
		int alt17=93;
		alt17 = dfa17.predict(input);
		switch (alt17) {
			case 1 :
				// mylexer.g:1:10: INCLUDE_
				{
				mINCLUDE_(); 

				}
				break;
			case 2 :
				// mylexer.g:1:19: DEFINE_
				{
				mDEFINE_(); 

				}
				break;
			case 3 :
				// mylexer.g:1:27: INT_TYPE
				{
				mINT_TYPE(); 

				}
				break;
			case 4 :
				// mylexer.g:1:36: CHAR_TYPE
				{
				mCHAR_TYPE(); 

				}
				break;
			case 5 :
				// mylexer.g:1:46: VOID_TYPE
				{
				mVOID_TYPE(); 

				}
				break;
			case 6 :
				// mylexer.g:1:56: BOOL_TYPE
				{
				mBOOL_TYPE(); 

				}
				break;
			case 7 :
				// mylexer.g:1:66: AUTO_TYPE
				{
				mAUTO_TYPE(); 

				}
				break;
			case 8 :
				// mylexer.g:1:76: SIGN_TYPE
				{
				mSIGN_TYPE(); 

				}
				break;
			case 9 :
				// mylexer.g:1:86: USIGN_TYPE
				{
				mUSIGN_TYPE(); 

				}
				break;
			case 10 :
				// mylexer.g:1:97: UNION_TYPE
				{
				mUNION_TYPE(); 

				}
				break;
			case 11 :
				// mylexer.g:1:108: SHORT_TYPE
				{
				mSHORT_TYPE(); 

				}
				break;
			case 12 :
				// mylexer.g:1:119: FLOAT_TYPE
				{
				mFLOAT_TYPE(); 

				}
				break;
			case 13 :
				// mylexer.g:1:130: DOUBL_TYPE
				{
				mDOUBL_TYPE(); 

				}
				break;
			case 14 :
				// mylexer.g:1:141: LONG_TYPE
				{
				mLONG_TYPE(); 

				}
				break;
			case 15 :
				// mylexer.g:1:151: LLONG_TYPE
				{
				mLLONG_TYPE(); 

				}
				break;
			case 16 :
				// mylexer.g:1:162: STRUC_TYPE
				{
				mSTRUC_TYPE(); 

				}
				break;
			case 17 :
				// mylexer.g:1:173: TYPEDEF_
				{
				mTYPEDEF_(); 

				}
				break;
			case 18 :
				// mylexer.g:1:182: STATIC_
				{
				mSTATIC_(); 

				}
				break;
			case 19 :
				// mylexer.g:1:190: EXTERN_
				{
				mEXTERN_(); 

				}
				break;
			case 20 :
				// mylexer.g:1:198: WHILE_
				{
				mWHILE_(); 

				}
				break;
			case 21 :
				// mylexer.g:1:205: SWITCH_
				{
				mSWITCH_(); 

				}
				break;
			case 22 :
				// mylexer.g:1:213: CASE_
				{
				mCASE_(); 

				}
				break;
			case 23 :
				// mylexer.g:1:219: BREAK_
				{
				mBREAK_(); 

				}
				break;
			case 24 :
				// mylexer.g:1:226: RETURN_
				{
				mRETURN_(); 

				}
				break;
			case 25 :
				// mylexer.g:1:234: DEFUALT_
				{
				mDEFUALT_(); 

				}
				break;
			case 26 :
				// mylexer.g:1:243: CONST_
				{
				mCONST_(); 

				}
				break;
			case 27 :
				// mylexer.g:1:250: FOR_
				{
				mFOR_(); 

				}
				break;
			case 28 :
				// mylexer.g:1:255: IF_
				{
				mIF_(); 

				}
				break;
			case 29 :
				// mylexer.g:1:259: ELSE_
				{
				mELSE_(); 

				}
				break;
			case 30 :
				// mylexer.g:1:265: ELSEIF_
				{
				mELSEIF_(); 

				}
				break;
			case 31 :
				// mylexer.g:1:273: CONTINUE_
				{
				mCONTINUE_(); 

				}
				break;
			case 32 :
				// mylexer.g:1:283: DOWHILE_
				{
				mDOWHILE_(); 

				}
				break;
			case 33 :
				// mylexer.g:1:292: EQ_OP
				{
				mEQ_OP(); 

				}
				break;
			case 34 :
				// mylexer.g:1:298: LE_OP
				{
				mLE_OP(); 

				}
				break;
			case 35 :
				// mylexer.g:1:304: GE_OP
				{
				mGE_OP(); 

				}
				break;
			case 36 :
				// mylexer.g:1:310: NE_OP
				{
				mNE_OP(); 

				}
				break;
			case 37 :
				// mylexer.g:1:316: PP_OP
				{
				mPP_OP(); 

				}
				break;
			case 38 :
				// mylexer.g:1:322: MM_OP
				{
				mMM_OP(); 

				}
				break;
			case 39 :
				// mylexer.g:1:328: OR_OP
				{
				mOR_OP(); 

				}
				break;
			case 40 :
				// mylexer.g:1:334: ANDEUQ_OP
				{
				mANDEUQ_OP(); 

				}
				break;
			case 41 :
				// mylexer.g:1:344: DECEQU_OP
				{
				mDECEQU_OP(); 

				}
				break;
			case 42 :
				// mylexer.g:1:354: MULEQU_OP
				{
				mMULEQU_OP(); 

				}
				break;
			case 43 :
				// mylexer.g:1:364: DIVEQU_OP
				{
				mDIVEQU_OP(); 

				}
				break;
			case 44 :
				// mylexer.g:1:374: RSHIFT_OP
				{
				mRSHIFT_OP(); 

				}
				break;
			case 45 :
				// mylexer.g:1:384: LSHIFT_OP
				{
				mLSHIFT_OP(); 

				}
				break;
			case 46 :
				// mylexer.g:1:394: ANDAND_OP
				{
				mANDAND_OP(); 

				}
				break;
			case 47 :
				// mylexer.g:1:404: INDICA_OP
				{
				mINDICA_OP(); 

				}
				break;
			case 48 :
				// mylexer.g:1:414: NEW_LINE
				{
				mNEW_LINE(); 

				}
				break;
			case 49 :
				// mylexer.g:1:423: HASHTAG
				{
				mHASHTAG(); 

				}
				break;
			case 50 :
				// mylexer.g:1:431: LINE_BREAK
				{
				mLINE_BREAK(); 

				}
				break;
			case 51 :
				// mylexer.g:1:442: IND_VAR
				{
				mIND_VAR(); 

				}
				break;
			case 52 :
				// mylexer.g:1:450: INDIND_VAR
				{
				mINDIND_VAR(); 

				}
				break;
			case 53 :
				// mylexer.g:1:461: HEADER
				{
				mHEADER(); 

				}
				break;
			case 54 :
				// mylexer.g:1:468: ADD_OP
				{
				mADD_OP(); 

				}
				break;
			case 55 :
				// mylexer.g:1:475: DEC_OP
				{
				mDEC_OP(); 

				}
				break;
			case 56 :
				// mylexer.g:1:482: MUL_OP
				{
				mMUL_OP(); 

				}
				break;
			case 57 :
				// mylexer.g:1:489: DIV_OP
				{
				mDIV_OP(); 

				}
				break;
			case 58 :
				// mylexer.g:1:496: EQU_OP
				{
				mEQU_OP(); 

				}
				break;
			case 59 :
				// mylexer.g:1:503: MOD_OP
				{
				mMOD_OP(); 

				}
				break;
			case 60 :
				// mylexer.g:1:510: LES_OP
				{
				mLES_OP(); 

				}
				break;
			case 61 :
				// mylexer.g:1:517: GRT_OP
				{
				mGRT_OP(); 

				}
				break;
			case 62 :
				// mylexer.g:1:524: ESP_OP
				{
				mESP_OP(); 

				}
				break;
			case 63 :
				// mylexer.g:1:531: BOO_OP
				{
				mBOO_OP(); 

				}
				break;
			case 64 :
				// mylexer.g:1:538: SEI_OP
				{
				mSEI_OP(); 

				}
				break;
			case 65 :
				// mylexer.g:1:545: ORR_OP
				{
				mORR_OP(); 

				}
				break;
			case 66 :
				// mylexer.g:1:552: LPAR_OP
				{
				mLPAR_OP(); 

				}
				break;
			case 67 :
				// mylexer.g:1:560: RPAR_OP
				{
				mRPAR_OP(); 

				}
				break;
			case 68 :
				// mylexer.g:1:568: LCUR_OP
				{
				mLCUR_OP(); 

				}
				break;
			case 69 :
				// mylexer.g:1:576: RCUR_OP
				{
				mRCUR_OP(); 

				}
				break;
			case 70 :
				// mylexer.g:1:584: LBAR_OP
				{
				mLBAR_OP(); 

				}
				break;
			case 71 :
				// mylexer.g:1:592: RBAR_OP
				{
				mRBAR_OP(); 

				}
				break;
			case 72 :
				// mylexer.g:1:600: SEMICOL_OP
				{
				mSEMICOL_OP(); 

				}
				break;
			case 73 :
				// mylexer.g:1:611: COLON_OP
				{
				mCOLON_OP(); 

				}
				break;
			case 74 :
				// mylexer.g:1:620: COMMA_OP
				{
				mCOMMA_OP(); 

				}
				break;
			case 75 :
				// mylexer.g:1:629: DMARK_OP
				{
				mDMARK_OP(); 

				}
				break;
			case 76 :
				// mylexer.g:1:638: QMARK_OP
				{
				mQMARK_OP(); 

				}
				break;
			case 77 :
				// mylexer.g:1:647: MAIN_
				{
				mMAIN_(); 

				}
				break;
			case 78 :
				// mylexer.g:1:653: PRINTF_
				{
				mPRINTF_(); 

				}
				break;
			case 79 :
				// mylexer.g:1:661: SCNAF_
				{
				mSCNAF_(); 

				}
				break;
			case 80 :
				// mylexer.g:1:668: FGETS_
				{
				mFGETS_(); 

				}
				break;
			case 81 :
				// mylexer.g:1:675: STRLEN_
				{
				mSTRLEN_(); 

				}
				break;
			case 82 :
				// mylexer.g:1:683: STRCSPN_
				{
				mSTRCSPN_(); 

				}
				break;
			case 83 :
				// mylexer.g:1:692: MALLOC_
				{
				mMALLOC_(); 

				}
				break;
			case 84 :
				// mylexer.g:1:700: STRDUP_
				{
				mSTRDUP_(); 

				}
				break;
			case 85 :
				// mylexer.g:1:708: STRCMP_
				{
				mSTRCMP_(); 

				}
				break;
			case 86 :
				// mylexer.g:1:716: FREE_
				{
				mFREE_(); 

				}
				break;
			case 87 :
				// mylexer.g:1:722: DEC_NUM
				{
				mDEC_NUM(); 

				}
				break;
			case 88 :
				// mylexer.g:1:730: ID
				{
				mID(); 

				}
				break;
			case 89 :
				// mylexer.g:1:733: SEN
				{
				mSEN(); 

				}
				break;
			case 90 :
				// mylexer.g:1:737: FLOAT_NUM
				{
				mFLOAT_NUM(); 

				}
				break;
			case 91 :
				// mylexer.g:1:747: COMMENT1
				{
				mCOMMENT1(); 

				}
				break;
			case 92 :
				// mylexer.g:1:756: COMMENT2
				{
				mCOMMENT2(); 

				}
				break;
			case 93 :
				// mylexer.g:1:765: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA9 dfa9 = new DFA9(this);
	protected DFA17 dfa17 = new DFA17(this);
	static final String DFA9_eotS =
		"\1\uffff\1\4\3\uffff";
	static final String DFA9_eofS =
		"\5\uffff";
	static final String DFA9_minS =
		"\2\56\3\uffff";
	static final String DFA9_maxS =
		"\2\71\3\uffff";
	static final String DFA9_acceptS =
		"\2\uffff\1\2\1\1\1\3";
	static final String DFA9_specialS =
		"\5\uffff}>";
	static final String[] DFA9_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\3\1\uffff\12\1",
			"",
			"",
			""
	};

	static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
	static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
	static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
	static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
	static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
	static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
	static final short[][] DFA9_transition;

	static {
		int numStates = DFA9_transitionS.length;
		DFA9_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
		}
	}

	protected class DFA9 extends DFA {

		public DFA9(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 9;
			this.eot = DFA9_eot;
			this.eof = DFA9_eof;
			this.min = DFA9_min;
			this.max = DFA9_max;
			this.accept = DFA9_accept;
			this.special = DFA9_special;
			this.transition = DFA9_transition;
		}
		@Override
		public String getDescription() {
			return "114:1: FLOAT_NUM : ( FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3 );";
		}
	}

	static final String DFA17_eotS =
		"\1\uffff\16\64\1\117\1\122\1\125\1\127\1\132\1\136\1\140\1\144\1\150\1"+
		"\152\3\uffff\1\64\13\uffff\1\154\1\156\2\64\2\160\2\uffff\1\64\1\164\1"+
		"\64\2\uffff\31\64\35\uffff\1\64\3\uffff\1\64\1\uffff\1\160\1\64\1\u0095"+
		"\1\uffff\2\64\1\uffff\20\64\1\u00ad\14\64\1\uffff\3\64\1\u00bd\1\u00be"+
		"\2\64\1\u00c1\1\u00c2\1\64\1\u00c4\14\64\1\uffff\1\64\1\u00d3\1\u00d5"+
		"\2\64\1\u00d9\2\64\1\u00dc\6\64\2\uffff\1\u00e3\1\64\2\uffff\1\u00e5\1"+
		"\uffff\1\64\1\u00e7\7\64\1\u00ef\1\64\1\u00f1\1\u00f2\1\u00f3\3\uffff"+
		"\2\64\2\uffff\1\u00f6\1\64\1\uffff\3\64\1\u00fb\1\64\1\u00fd\1\uffff\1"+
		"\64\1\uffff\1\u00ff\1\uffff\1\u0100\1\u0101\1\64\1\u0103\1\u0104\1\u0105"+
		"\1\u0106\1\uffff\1\64\3\uffff\1\64\1\u0109\1\uffff\1\u010a\1\u010b\1\u010c"+
		"\1\u010d\1\uffff\1\u010e\1\uffff\1\64\3\uffff\1\u0110\4\uffff\1\64\1\u0112"+
		"\6\uffff\1\u0113\1\uffff\1\u0114\3\uffff";
	static final String DFA17_eofS =
		"\u0115\uffff";
	static final String DFA17_minS =
		"\1\11\16\56\1\75\1\74\2\75\1\53\1\55\1\174\2\52\1\46\3\uffff\1\56\13\uffff"+
		"\2\0\4\56\2\uffff\3\56\2\uffff\31\56\35\uffff\1\56\3\uffff\1\56\1\uffff"+
		"\3\56\1\uffff\2\56\1\uffff\35\56\1\uffff\27\56\1\uffff\2\56\1\40\2\56"+
		"\1\40\11\56\2\uffff\2\56\2\uffff\1\56\1\uffff\16\56\3\uffff\2\56\2\uffff"+
		"\2\56\1\uffff\6\56\1\uffff\1\56\1\uffff\1\56\1\uffff\7\56\1\uffff\1\56"+
		"\3\uffff\2\56\1\uffff\4\56\1\uffff\1\56\1\uffff\1\56\3\uffff\1\56\4\uffff"+
		"\2\56\6\uffff\1\56\1\uffff\1\56\3\uffff";
	static final String DFA17_maxS =
		"\1\176\16\172\2\75\1\76\2\75\1\76\1\174\1\172\1\75\1\46\3\uffff\1\172"+
		"\13\uffff\2\uffff\2\172\2\71\2\uffff\3\172\2\uffff\1\172\1\173\27\172"+
		"\35\uffff\1\172\3\uffff\1\172\1\uffff\1\71\2\172\1\uffff\2\172\1\uffff"+
		"\35\172\1\uffff\27\172\1\uffff\17\172\2\uffff\2\172\2\uffff\1\172\1\uffff"+
		"\16\172\3\uffff\2\172\2\uffff\2\172\1\uffff\6\172\1\uffff\1\172\1\uffff"+
		"\1\172\1\uffff\7\172\1\uffff\1\172\3\uffff\2\172\1\uffff\4\172\1\uffff"+
		"\1\172\1\uffff\1\172\3\uffff\1\172\4\uffff\2\172\6\uffff\1\172\1\uffff"+
		"\1\172\3\uffff";
	static final String DFA17_acceptS =
		"\31\uffff\1\60\1\61\1\62\1\uffff\1\73\1\77\1\102\1\103\1\104\1\105\1\106"+
		"\1\107\1\110\1\111\1\112\6\uffff\1\132\1\135\3\uffff\1\65\1\130\31\uffff"+
		"\1\41\1\72\1\42\1\54\1\74\1\43\1\55\1\75\1\44\1\100\1\45\1\50\1\66\1\46"+
		"\1\51\1\57\1\67\1\47\1\101\1\52\1\63\1\64\1\70\1\53\1\133\1\134\1\71\1"+
		"\56\1\76\1\uffff\1\113\1\131\1\114\1\uffff\1\127\3\uffff\1\34\2\uffff"+
		"\1\40\35\uffff\1\3\27\uffff\1\33\17\uffff\1\4\1\26\2\uffff\1\5\1\6\1\uffff"+
		"\1\7\16\uffff\1\126\1\17\1\16\2\uffff\1\36\1\35\2\uffff\1\115\6\uffff"+
		"\1\32\1\uffff\1\27\1\uffff\1\13\7\uffff\1\117\1\uffff\1\12\1\14\1\120"+
		"\2\uffff\1\24\4\uffff\1\2\1\uffff\1\15\1\uffff\1\10\1\20\1\121\1\uffff"+
		"\1\125\1\124\1\22\1\25\2\uffff\1\23\1\30\1\123\1\116\1\1\1\31\1\uffff"+
		"\1\122\1\uffff\1\21\1\37\1\11";
	static final String DFA17_specialS =
		"\50\uffff\1\1\1\0\u00eb\uffff}>";
	static final String[] DFA17_transitionS = {
			"\1\57\1\31\2\uffff\1\57\22\uffff\1\57\1\22\1\50\1\32\1\uffff\1\35\1\30"+
			"\1\51\1\37\1\40\1\26\1\23\1\47\1\24\1\56\1\27\1\54\11\55\1\46\1\45\1"+
			"\20\1\17\1\21\2\uffff\32\53\1\43\1\33\1\44\1\uffff\1\53\1\uffff\1\6\1"+
			"\5\1\3\1\2\1\14\1\11\2\53\1\1\2\53\1\12\1\34\2\53\1\52\1\53\1\16\1\7"+
			"\1\13\1\10\1\4\1\15\3\53\1\41\1\25\1\42\1\36",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\5\62\1\61\7\62"+
			"\1\60\14\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\65\11"+
			"\62\1\66\13\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\70\6\62\1\67"+
			"\6\62\1\71\13\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\72\13"+
			"\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\73\2"+
			"\62\1\74\10\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\24\62\1\75\5"+
			"\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\102\4"+
			"\62\1\77\1\76\12\62\1\100\2\62\1\101\3\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\103\14"+
			"\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\6\62\1\106\4"+
			"\62\1\104\2\62\1\105\2\62\1\107\10\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\110\13"+
			"\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\30\62\1\111\1"+
			"\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\113\13"+
			"\62\1\112\2\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\7\62\1\114\22"+
			"\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\115\25"+
			"\62",
			"\1\116",
			"\1\121\1\120",
			"\1\123\1\124",
			"\1\126",
			"\1\130\21\uffff\1\131",
			"\1\133\17\uffff\1\134\1\135",
			"\1\137",
			"\1\143\22\uffff\1\141\3\uffff\32\142\4\uffff\1\142\1\uffff\32\142",
			"\1\147\4\uffff\1\146\15\uffff\1\145",
			"\1\151",
			"",
			"",
			"",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\153\31\62",
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
			"\0\155",
			"\0\155",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\157\10"+
			"\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\56\1\uffff\12\56",
			"\1\56\1\uffff\12\161",
			"",
			"",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\162\20"+
			"\62\1\163\6\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"",
			"",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\5\62\1\165\24"+
			"\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\24\62\1\166\5"+
			"\62\1\167",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\170\31\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\171\7"+
			"\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\172\14"+
			"\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\173\21"+
			"\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\174\13"+
			"\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\175\25"+
			"\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\176\6"+
			"\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\6\62\1\177\23"+
			"\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\u0080"+
			"\13\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\u0082\20\62"+
			"\1\u0081\10\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u0083"+
			"\21\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\u0084\31\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u0086"+
			"\11\62\1\u0085\7\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\u0087"+
			"\13\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u0088"+
			"\10\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u0089"+
			"\25\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u008a"+
			"\25\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u008b"+
			"\14\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\17\62\1\u008c"+
			"\12\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u008d"+
			"\6\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u008e"+
			"\7\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u008f"+
			"\21\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u0090"+
			"\6\62",
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
			"",
			"",
			"",
			"",
			"",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u0091"+
			"\2\62\1\u0092\16\62",
			"",
			"",
			"",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u0093"+
			"\21\62",
			"",
			"\1\56\1\uffff\12\161",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u0094"+
			"\16\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\u0097\7\62"+
			"\1\u0096\21\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\62\1\u0098"+
			"\30\62",
			"",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u0099"+
			"\10\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u009a"+
			"\25\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u009b"+
			"\1\u009c\6\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\3\62\1\u009d"+
			"\26\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u009e"+
			"\16\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\u009f\31\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\u00a0"+
			"\13\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u00a1"+
			"\14\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u00a2"+
			"\10\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\u00a5"+
			"\1\u00a6\7\62\1\u00a4\10\62\1\u00a3\5\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u00a7"+
			"\6\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u00a8"+
			"\6\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u00a9"+
			"\14\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u00aa"+
			"\21\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\u00ab"+
			"\13\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\u00ac\31\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u00ae"+
			"\6\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00af"+
			"\25\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\6\62\1\u00b0"+
			"\23\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00b1"+
			"\25\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00b2"+
			"\25\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00b3"+
			"\25\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u00b4"+
			"\16\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\24\62\1\u00b5"+
			"\5\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u00b6"+
			"\14\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u00b7"+
			"\16\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u00b8"+
			"\14\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\24\62\1\u00b9"+
			"\5\62",
			"",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u00ba"+
			"\14\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\24\62\1\u00bb"+
			"\5\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u00bc"+
			"\16\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u00bf"+
			"\6\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u00c0"+
			"\21\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\12\62\1\u00c3"+
			"\17\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00c5"+
			"\25\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u00c6"+
			"\6\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\u00c7"+
			"\27\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00c8"+
			"\25\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\14\62\1\u00ca"+
			"\5\62\1\u00c9\7\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\24\62\1\u00cb"+
			"\5\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u00cc"+
			"\21\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\u00cd"+
			"\27\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\5\62\1\u00ce"+
			"\24\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\6\62\1\u00cf"+
			"\23\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u00d0"+
			"\14\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u00d1"+
			"\6\62",
			"",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u00d2"+
			"\7\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\u00d4\15\uffff\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff"+
			"\32\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\3\62\1\u00d6"+
			"\26\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u00d7"+
			"\10\62",
			"\1\u00d8\15\uffff\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff"+
			"\32\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00da"+
			"\25\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u00db"+
			"\10\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\u00dd"+
			"\13\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u00de"+
			"\6\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\3\62\1\u00df"+
			"\26\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00e0"+
			"\25\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u00e1"+
			"\16\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00e2"+
			"\25\62",
			"",
			"",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u00e4"+
			"\14\62",
			"",
			"",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\3\62\1\u00e6"+
			"\26\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u00e8"+
			"\6\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u00e9"+
			"\14\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\17\62\1\u00ea"+
			"\12\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\17\62\1\u00eb"+
			"\12\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\17\62\1\u00ec"+
			"\12\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\u00ed"+
			"\27\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\7\62\1\u00ee"+
			"\22\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u00f0"+
			"\14\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"",
			"",
			"",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00f4"+
			"\25\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u00f5"+
			"\14\62",
			"",
			"",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u00f7"+
			"\14\62",
			"",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\u00f8"+
			"\27\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\5\62\1\u00f9"+
			"\24\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00fa"+
			"\25\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u00fc"+
			"\6\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\24\62\1\u00fe"+
			"\5\62",
			"",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u0102"+
			"\14\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u0107"+
			"\25\62",
			"",
			"",
			"",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\5\62\1\u0108"+
			"\24\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u010f"+
			"\25\62",
			"",
			"",
			"",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"",
			"",
			"",
			"",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\3\62\1\u0111"+
			"\26\62",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"",
			"\1\63\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"",
			"",
			""
	};

	static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
	static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
	static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
	static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
	static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
	static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
	static final short[][] DFA17_transition;

	static {
		int numStates = DFA17_transitionS.length;
		DFA17_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
		}
	}

	protected class DFA17 extends DFA {

		public DFA17(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 17;
			this.eot = DFA17_eot;
			this.eof = DFA17_eof;
			this.min = DFA17_min;
			this.max = DFA17_max;
			this.accept = DFA17_accept;
			this.special = DFA17_special;
			this.transition = DFA17_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( INCLUDE_ | DEFINE_ | INT_TYPE | CHAR_TYPE | VOID_TYPE | BOOL_TYPE | AUTO_TYPE | SIGN_TYPE | USIGN_TYPE | UNION_TYPE | SHORT_TYPE | FLOAT_TYPE | DOUBL_TYPE | LONG_TYPE | LLONG_TYPE | STRUC_TYPE | TYPEDEF_ | STATIC_ | EXTERN_ | WHILE_ | SWITCH_ | CASE_ | BREAK_ | RETURN_ | DEFUALT_ | CONST_ | FOR_ | IF_ | ELSE_ | ELSEIF_ | CONTINUE_ | DOWHILE_ | EQ_OP | LE_OP | GE_OP | NE_OP | PP_OP | MM_OP | OR_OP | ANDEUQ_OP | DECEQU_OP | MULEQU_OP | DIVEQU_OP | RSHIFT_OP | LSHIFT_OP | ANDAND_OP | INDICA_OP | NEW_LINE | HASHTAG | LINE_BREAK | IND_VAR | INDIND_VAR | HEADER | ADD_OP | DEC_OP | MUL_OP | DIV_OP | EQU_OP | MOD_OP | LES_OP | GRT_OP | ESP_OP | BOO_OP | SEI_OP | ORR_OP | LPAR_OP | RPAR_OP | LCUR_OP | RCUR_OP | LBAR_OP | RBAR_OP | SEMICOL_OP | COLON_OP | COMMA_OP | DMARK_OP | QMARK_OP | MAIN_ | PRINTF_ | SCNAF_ | FGETS_ | STRLEN_ | STRCSPN_ | MALLOC_ | STRDUP_ | STRCMP_ | FREE_ | DEC_NUM | ID | SEN | FLOAT_NUM | COMMENT1 | COMMENT2 | WS );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA17_41 = input.LA(1);
						s = -1;
						if ( ((LA17_41 >= '\u0000' && LA17_41 <= '\uFFFF')) ) {s = 109;}
						else s = 110;
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA17_40 = input.LA(1);
						s = -1;
						if ( ((LA17_40 >= '\u0000' && LA17_40 <= '\uFFFF')) ) {s = 109;}
						else s = 108;
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 17, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
