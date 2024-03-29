/** \file
 *  This C source file was generated by $ANTLR version 3.4
 *
 *     -  From the grammar source file : Expr.g
 *     -                            On : 2012-04-30 11:38:13
 *     -                for the parser : ExprParserParser
 *
 * Editing it, at least manually, is not wise.
 *
 * C language generator and runtime by Jim Idle, jimi|hereisanat|idle|dotgoeshere|ws.
 *
 *
*/
// [The "BSD license"]
// Copyright (c) 2005-2009 Jim Idle, Temporal Wave LLC
// http://www.temporal-wave.com
// http://www.linkedin.com/in/jimidle
//
// All rights reserved.
//
// Redistribution and use in source and binary forms, with or without
// modification, are permitted provided that the following conditions
// are met:
// 1. Redistributions of source code must retain the above copyright
//    notice, this list of conditions and the following disclaimer.
// 2. Redistributions in binary form must reproduce the above copyright
//    notice, this list of conditions and the following disclaimer in the
//    documentation and/or other materials provided with the distribution.
// 3. The name of the author may not be used to endorse or promote products
//    derived from this software without specific prior written permission.
//
// THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
// IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
// OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
// IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
// INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
// NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
// DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
// THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
// (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
// THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

/* -----------------------------------------
 * Include the ANTLR3 generated header file.
 */
#include    "ExprParser.h"
/* ----------------------------------------- */





/* MACROS that hide the C interface implementations from the
 * generated code, which makes it a little more understandable to the human eye.
 * I am very much against using C pre-processor macros for function calls and bits
 * of code as you cannot see what is happening when single stepping in debuggers
 * and so on. The exception (in my book at least) is for generated code, where you are
 * not maintaining it, but may wish to read and understand it. If you single step it, you know that input()
 * hides some indirect calls, but is always referring to the input stream. This is
 * probably more readable than ctx->input->istream->input(snarfle0->blarg) and allows me to rejig
 * the runtime interfaces without changing the generated code too often, without
 * confusing the reader of the generated output, who may not wish to know the gory
 * details of the interface inheritance.
 */

#define		CTX	ctx

/* Aids in accessing scopes for grammar programmers
 */
#undef	SCOPE_TYPE
#undef	SCOPE_STACK
#undef	SCOPE_TOP
#define	SCOPE_TYPE(scope)   pExprParser_##scope##_SCOPE
#define SCOPE_STACK(scope)  pExprParser_##scope##Stack
#define	SCOPE_TOP(scope)    ctx->pExprParser_##scope##Top
#define	SCOPE_SIZE(scope)		ctx->pExprParser_##scope##Stack_limit
#define SCOPE_INSTANCE(scope, i)	(ctx->SCOPE_STACK(scope)->get(ctx->SCOPE_STACK(scope),i))

/* Macros for accessing things in the parser
 */

#undef	    PARSER
#undef	    RECOGNIZER
#undef	    HAVEPARSEDRULE
#undef		MEMOIZE
#undef	    INPUT
#undef	    STRSTREAM
#undef	    HASEXCEPTION
#undef	    EXCEPTION
#undef	    MATCHT
#undef	    MATCHANYT
#undef	    FOLLOWSTACK
#undef	    FOLLOWPUSH
#undef	    FOLLOWPOP
#undef	    PRECOVER
#undef	    PREPORTERROR
#undef	    LA
#undef	    LT
#undef	    CONSTRUCTEX
#undef	    CONSUME
#undef	    MARK
#undef	    REWIND
#undef	    REWINDLAST
#undef	    PERRORRECOVERY
#undef	    HASFAILED
#undef	    FAILEDFLAG
#undef	    RECOVERFROMMISMATCHEDSET
#undef	    RECOVERFROMMISMATCHEDELEMENT
#undef		INDEX
#undef      ADAPTOR
#undef		SEEK
#undef	    RULEMEMO
#undef		DBG

#define	    PARSER				ctx->pParser
#define	    RECOGNIZER				PARSER->rec
#define	    PSRSTATE				RECOGNIZER->state
#define	    HAVEPARSEDRULE(r)			RECOGNIZER->alreadyParsedRule(RECOGNIZER, r)
#define	    MEMOIZE(ri,si)			RECOGNIZER->memoize(RECOGNIZER, ri, si)
#define	    INPUT				PARSER->tstream
#define	    STRSTREAM				INPUT
#define	    ISTREAM				INPUT->istream
#define	    INDEX()				ISTREAM->index(INPUT->istream)
#define	    HASEXCEPTION()			(PSRSTATE->error == ANTLR3_TRUE)
#define	    EXCEPTION				PSRSTATE->exception
#define	    MATCHT(t, fs)			RECOGNIZER->match(RECOGNIZER, t, fs)
#define	    MATCHANYT()				RECOGNIZER->matchAny(RECOGNIZER)
#define	    FOLLOWSTACK				PSRSTATE->following
#ifdef  SKIP_FOLLOW_SETS
#define	    FOLLOWPUSH(x)
#define	    FOLLOWPOP()
#else
#define	    FOLLOWPUSH(x)			FOLLOWSTACK->push(FOLLOWSTACK, ((void *)(&(x))), NULL)
#define	    FOLLOWPOP()				FOLLOWSTACK->pop(FOLLOWSTACK)
#endif
#define	    PRECOVER()				RECOGNIZER->recover(RECOGNIZER)
#define	    PREPORTERROR()			RECOGNIZER->reportError(RECOGNIZER)
#define	    LA(n)				INPUT->istream->_LA(ISTREAM, n)
#define	    LT(n)				INPUT->_LT(INPUT, n)
#define	    CONSTRUCTEX()			RECOGNIZER->exConstruct(RECOGNIZER)
#define	    CONSUME()				ISTREAM->consume(ISTREAM)
#define	    MARK()				ISTREAM->mark(ISTREAM)
#define	    REWIND(m)				ISTREAM->rewind(ISTREAM, m)
#define	    REWINDLAST()			ISTREAM->rewindLast(ISTREAM)
#define	    SEEK(n)				ISTREAM->seek(ISTREAM, n)
#define	    PERRORRECOVERY			PSRSTATE->errorRecovery
#define	    FAILEDFLAG				PSRSTATE->failed
#define	    HASFAILED()				(FAILEDFLAG == ANTLR3_TRUE)
#define	    BACKTRACKING			PSRSTATE->backtracking
#define	    RECOVERFROMMISMATCHEDSET(s)		RECOGNIZER->recoverFromMismatchedSet(RECOGNIZER, s)
#define	    RECOVERFROMMISMATCHEDELEMENT(e)	RECOGNIZER->recoverFromMismatchedElement(RECOGNIZER, s)
#define     ADAPTOR                         ctx->adaptor
#define		RULEMEMO						PSRSTATE->ruleMemo
#define		DBG								RECOGNIZER->debugger


#define		TOKTEXT(tok, txt)				tok, (pANTLR3_UINT8)txt

/* The 4 tokens defined below may well clash with your own #defines or token types. If so
 * then for the present you must use different names for your defines as these are hard coded
 * in the code generator. It would be better not to use such names internally, and maybe
 * we can change this in a forthcoming release. I deliberately do not #undef these
 * here as this will at least give you a redefined error somewhere if they clash.
 */
#define	    UP	    ANTLR3_TOKEN_UP
#define	    DOWN    ANTLR3_TOKEN_DOWN
#define	    EOR	    ANTLR3_TOKEN_EOR
#define	    INVALID ANTLR3_TOKEN_INVALID


/* =============================================================================
 * Functions to create and destroy scopes. First come the rule scopes, followed
 * by the global declared scopes.
 */



/* ============================================================================= */

/* =============================================================================
 * Start of recognizer
 */


/** \brief Table of all token names in symbolic order, mainly used for
 *         error reporting.
 */
pANTLR3_UINT8   ExprParserTokenNames[8+4]
     = {
        (pANTLR3_UINT8) "<invalid>",       /* String to print to indicate an invalid token */
        (pANTLR3_UINT8) "<EOR>",
        (pANTLR3_UINT8) "<DOWN>",
        (pANTLR3_UINT8) "<UP>",
        (pANTLR3_UINT8) "Number",
        (pANTLR3_UINT8) "WS",
        (pANTLR3_UINT8) "'('",
        (pANTLR3_UINT8) "')'",
        (pANTLR3_UINT8) "'*'",
        (pANTLR3_UINT8) "'+'",
        (pANTLR3_UINT8) "'-'",
        (pANTLR3_UINT8) "'/'"
       };



// Forward declare the locally static matching functions we have generated.
//
static 
 void
	eval    (pExprParser ctx);
static 
 void
	additionExp    (pExprParser ctx);
static 
 void
	multiplyExp    (pExprParser ctx);
static 
 void
	atomExp    (pExprParser ctx);
static void	ExprParserFree(pExprParser ctx);
static void     ExprParserReset (pExprParser ctx);

/* For use in tree output where we are accumulating rule labels via label += ruleRef
 * we need a function that knows how to free a return scope when the list is destroyed.
 * We cannot just use ANTLR3_FREE because in debug tracking mode, this is a macro.
 */
static	void ANTLR3_CDECL freeScope(void * scope)
{
    ANTLR3_FREE(scope);
}

/** \brief Name of the grammar file that generated this code
 */
static const char fileName[] = "Expr.g";

/** \brief Return the name of the grammar file that generated this code.
 */
static const char * getGrammarFileName()
{
	return fileName;
}
/** \brief Create a new ExprParser parser and return a context for it.
 *
 * \param[in] instream Pointer to an input stream interface.
 *
 * \return Pointer to new parser context upon success.
 */
ANTLR3_API pExprParser
ExprParserNew   (pANTLR3_COMMON_TOKEN_STREAM instream)
{
	// See if we can create a new parser with the standard constructor
	//
	return ExprParserNewSSD(instream, NULL);
}

/** \brief Create a new ExprParser parser and return a context for it.
 *
 * \param[in] instream Pointer to an input stream interface.
 *
 * \return Pointer to new parser context upon success.
 */
ANTLR3_API pExprParser
ExprParserNewSSD   (pANTLR3_COMMON_TOKEN_STREAM instream, pANTLR3_RECOGNIZER_SHARED_STATE state)
{
    pExprParser ctx;	    /* Context structure we will build and return   */

    ctx	= (pExprParser) ANTLR3_CALLOC(1, sizeof(ExprParser));

    if	(ctx == NULL)
    {
		// Failed to allocate memory for parser context
		//
        return  NULL;
    }

    /* -------------------------------------------------------------------
     * Memory for basic structure is allocated, now to fill in
     * the base ANTLR3 structures. We initialize the function pointers
     * for the standard ANTLR3 parser function set, but upon return
     * from here, the programmer may set the pointers to provide custom
     * implementations of each function.
     *
     * We don't use the macros defined in ExprParser.h here, in order that you can get a sense
     * of what goes where.
     */

    /* Create a base parser/recognizer, using the supplied token stream
     */
    ctx->pParser	    = antlr3ParserNewStream(ANTLR3_SIZE_HINT, instream->tstream, state);
    /* Install the implementation of our ExprParser interface
     */
    ctx->eval	= eval;
    ctx->additionExp	= additionExp;
    ctx->multiplyExp	= multiplyExp;
    ctx->atomExp	= atomExp;
    ctx->free			= ExprParserFree;
    ctx->reset			= ExprParserReset;
    ctx->getGrammarFileName	= getGrammarFileName;

    /* Install the scope pushing methods.
     */

    /* Install the token table
     */
    PSRSTATE->tokenNames   = ExprParserTokenNames;


    /* Return the newly built parser to the caller
     */
    return  ctx;
}

static void
ExprParserReset (pExprParser ctx)
{
    RECOGNIZER->reset(RECOGNIZER);
}

/** Free the parser resources
 */
 static void
 ExprParserFree(pExprParser ctx)
 {
    /* Free any scope memory
     */

	// Free this parser
	//
    ctx->pParser->free(ctx->pParser);


    ANTLR3_FREE(ctx);

    /* Everything is released, so we can return
     */
    return;
 }

/** Return token names used by this 
parser

 *
 * The returned pointer is used as an index into the token names table (using the token
 * number as the index).
 *
 * \return Pointer to first char * in the table.
 */
static pANTLR3_UINT8    *getTokenNames()
{
        return ExprParserTokenNames;
}


/* Declare the bitsets
 */
/** Bitset defining follow set for error recovery in rule state: FOLLOW_additionExp_in_eval31  */
static	ANTLR3_BITWORD FOLLOW_additionExp_in_eval31_bits[]	= { ANTLR3_UINT64_LIT(0x0000000000000002) };
static  ANTLR3_BITSET_LIST FOLLOW_additionExp_in_eval31	= { FOLLOW_additionExp_in_eval31_bits, 1	};
/** Bitset defining follow set for error recovery in rule state: FOLLOW_multiplyExp_in_additionExp57  */
static	ANTLR3_BITWORD FOLLOW_multiplyExp_in_additionExp57_bits[]	= { ANTLR3_UINT64_LIT(0x0000000000000602) };
static  ANTLR3_BITSET_LIST FOLLOW_multiplyExp_in_additionExp57	= { FOLLOW_multiplyExp_in_additionExp57_bits, 1	};
/** Bitset defining follow set for error recovery in rule state: FOLLOW_9_in_additionExp71  */
static	ANTLR3_BITWORD FOLLOW_9_in_additionExp71_bits[]	= { ANTLR3_UINT64_LIT(0x0000000000000050) };
static  ANTLR3_BITSET_LIST FOLLOW_9_in_additionExp71	= { FOLLOW_9_in_additionExp71_bits, 1	};
/** Bitset defining follow set for error recovery in rule state: FOLLOW_multiplyExp_in_additionExp73  */
static	ANTLR3_BITWORD FOLLOW_multiplyExp_in_additionExp73_bits[]	= { ANTLR3_UINT64_LIT(0x0000000000000602) };
static  ANTLR3_BITSET_LIST FOLLOW_multiplyExp_in_additionExp73	= { FOLLOW_multiplyExp_in_additionExp73_bits, 1	};
/** Bitset defining follow set for error recovery in rule state: FOLLOW_10_in_additionExp87  */
static	ANTLR3_BITWORD FOLLOW_10_in_additionExp87_bits[]	= { ANTLR3_UINT64_LIT(0x0000000000000050) };
static  ANTLR3_BITSET_LIST FOLLOW_10_in_additionExp87	= { FOLLOW_10_in_additionExp87_bits, 1	};
/** Bitset defining follow set for error recovery in rule state: FOLLOW_multiplyExp_in_additionExp89  */
static	ANTLR3_BITWORD FOLLOW_multiplyExp_in_additionExp89_bits[]	= { ANTLR3_UINT64_LIT(0x0000000000000602) };
static  ANTLR3_BITSET_LIST FOLLOW_multiplyExp_in_additionExp89	= { FOLLOW_multiplyExp_in_additionExp89_bits, 1	};
/** Bitset defining follow set for error recovery in rule state: FOLLOW_atomExp_in_multiplyExp124  */
static	ANTLR3_BITWORD FOLLOW_atomExp_in_multiplyExp124_bits[]	= { ANTLR3_UINT64_LIT(0x0000000000000902) };
static  ANTLR3_BITSET_LIST FOLLOW_atomExp_in_multiplyExp124	= { FOLLOW_atomExp_in_multiplyExp124_bits, 1	};
/** Bitset defining follow set for error recovery in rule state: FOLLOW_8_in_multiplyExp137  */
static	ANTLR3_BITWORD FOLLOW_8_in_multiplyExp137_bits[]	= { ANTLR3_UINT64_LIT(0x0000000000000050) };
static  ANTLR3_BITSET_LIST FOLLOW_8_in_multiplyExp137	= { FOLLOW_8_in_multiplyExp137_bits, 1	};
/** Bitset defining follow set for error recovery in rule state: FOLLOW_atomExp_in_multiplyExp139  */
static	ANTLR3_BITWORD FOLLOW_atomExp_in_multiplyExp139_bits[]	= { ANTLR3_UINT64_LIT(0x0000000000000902) };
static  ANTLR3_BITSET_LIST FOLLOW_atomExp_in_multiplyExp139	= { FOLLOW_atomExp_in_multiplyExp139_bits, 1	};
/** Bitset defining follow set for error recovery in rule state: FOLLOW_11_in_multiplyExp153  */
static	ANTLR3_BITWORD FOLLOW_11_in_multiplyExp153_bits[]	= { ANTLR3_UINT64_LIT(0x0000000000000050) };
static  ANTLR3_BITSET_LIST FOLLOW_11_in_multiplyExp153	= { FOLLOW_11_in_multiplyExp153_bits, 1	};
/** Bitset defining follow set for error recovery in rule state: FOLLOW_atomExp_in_multiplyExp155  */
static	ANTLR3_BITWORD FOLLOW_atomExp_in_multiplyExp155_bits[]	= { ANTLR3_UINT64_LIT(0x0000000000000902) };
static  ANTLR3_BITSET_LIST FOLLOW_atomExp_in_multiplyExp155	= { FOLLOW_atomExp_in_multiplyExp155_bits, 1	};
/** Bitset defining follow set for error recovery in rule state: FOLLOW_Number_in_atomExp190  */
static	ANTLR3_BITWORD FOLLOW_Number_in_atomExp190_bits[]	= { ANTLR3_UINT64_LIT(0x0000000000000002) };
static  ANTLR3_BITSET_LIST FOLLOW_Number_in_atomExp190	= { FOLLOW_Number_in_atomExp190_bits, 1	};
/** Bitset defining follow set for error recovery in rule state: FOLLOW_6_in_atomExp206  */
static	ANTLR3_BITWORD FOLLOW_6_in_atomExp206_bits[]	= { ANTLR3_UINT64_LIT(0x0000000000000050) };
static  ANTLR3_BITSET_LIST FOLLOW_6_in_atomExp206	= { FOLLOW_6_in_atomExp206_bits, 1	};
/** Bitset defining follow set for error recovery in rule state: FOLLOW_additionExp_in_atomExp208  */
static	ANTLR3_BITWORD FOLLOW_additionExp_in_atomExp208_bits[]	= { ANTLR3_UINT64_LIT(0x0000000000000080) };
static  ANTLR3_BITSET_LIST FOLLOW_additionExp_in_atomExp208	= { FOLLOW_additionExp_in_atomExp208_bits, 1	};
/** Bitset defining follow set for error recovery in rule state: FOLLOW_7_in_atomExp210  */
static	ANTLR3_BITWORD FOLLOW_7_in_atomExp210_bits[]	= { ANTLR3_UINT64_LIT(0x0000000000000002) };
static  ANTLR3_BITSET_LIST FOLLOW_7_in_atomExp210	= { FOLLOW_7_in_atomExp210_bits, 1	};


/* ==============================================
 * Parsing rules
 */
/**
 * $ANTLR start eval
 * Expr.g:8:1: eval : additionExp ;
 */
static void
eval(pExprParser ctx)
{
    /* Initialize rule variables
     */

    {
        // Expr.g:9:5: ( additionExp )
        // Expr.g:9:10: additionExp
        {
            FOLLOWPUSH(FOLLOW_additionExp_in_eval31);
            additionExp(ctx);

            FOLLOWPOP();
            if  (HASEXCEPTION())
            {
                goto ruleevalEx;
            }


        }

    }

    // This is where rules clean up and exit
    //
    goto ruleevalEx; /* Prevent compiler warnings */
    ruleevalEx: ;

            if (HASEXCEPTION())
            {
                PREPORTERROR();
                PRECOVER();
            }
    return ;
}
/* $ANTLR end eval */

/**
 * $ANTLR start additionExp
 * Expr.g:13:1: additionExp : multiplyExp ( '+' multiplyExp | '-' multiplyExp )* ;
 */
static void
additionExp(pExprParser ctx)
{
    /* Initialize rule variables
     */

    {
        // Expr.g:14:5: ( multiplyExp ( '+' multiplyExp | '-' multiplyExp )* )
        // Expr.g:14:10: multiplyExp ( '+' multiplyExp | '-' multiplyExp )*
        {
            FOLLOWPUSH(FOLLOW_multiplyExp_in_additionExp57);
            multiplyExp(ctx);

            FOLLOWPOP();
            if  (HASEXCEPTION())
            {
                goto ruleadditionExpEx;
            }


            // Expr.g:15:10: ( '+' multiplyExp | '-' multiplyExp )*

            for (;;)
            {
                int alt1=3;
                switch ( LA(1) )
                {
                case 9:
                	{
                		alt1=1;
                	}
                    break;
                case 10:
                	{
                		alt1=2;
                	}
                    break;

                }

                switch (alt1)
                {
            	case 1:
            	    // Expr.g:15:12: '+' multiplyExp
            	    {
            	         MATCHT(9, &FOLLOW_9_in_additionExp71);
            	        if  (HASEXCEPTION())
            	        {
            	            goto ruleadditionExpEx;
            	        }


            	        FOLLOWPUSH(FOLLOW_multiplyExp_in_additionExp73);
            	        multiplyExp(ctx);

            	        FOLLOWPOP();
            	        if  (HASEXCEPTION())
            	        {
            	            goto ruleadditionExpEx;
            	        }


            	    }
            	    break;
            	case 2:
            	    // Expr.g:16:12: '-' multiplyExp
            	    {
            	         MATCHT(10, &FOLLOW_10_in_additionExp87);
            	        if  (HASEXCEPTION())
            	        {
            	            goto ruleadditionExpEx;
            	        }


            	        FOLLOWPUSH(FOLLOW_multiplyExp_in_additionExp89);
            	        multiplyExp(ctx);

            	        FOLLOWPOP();
            	        if  (HASEXCEPTION())
            	        {
            	            goto ruleadditionExpEx;
            	        }


            	    }
            	    break;

            	default:
            	    goto loop1;	/* break out of the loop */
            	    break;
                }
            }
            loop1: ; /* Jump out to here if this rule does not match */


        }

    }

    // This is where rules clean up and exit
    //
    goto ruleadditionExpEx; /* Prevent compiler warnings */
    ruleadditionExpEx: ;

            if (HASEXCEPTION())
            {
                PREPORTERROR();
                PRECOVER();
            }
    return ;
}
/* $ANTLR end additionExp */

/**
 * $ANTLR start multiplyExp
 * Expr.g:21:1: multiplyExp : atomExp ( '*' atomExp | '/' atomExp )* ;
 */
static void
multiplyExp(pExprParser ctx)
{
    /* Initialize rule variables
     */

    {
        // Expr.g:22:5: ( atomExp ( '*' atomExp | '/' atomExp )* )
        // Expr.g:22:10: atomExp ( '*' atomExp | '/' atomExp )*
        {
            FOLLOWPUSH(FOLLOW_atomExp_in_multiplyExp124);
            atomExp(ctx);

            FOLLOWPOP();
            if  (HASEXCEPTION())
            {
                goto rulemultiplyExpEx;
            }


            // Expr.g:23:10: ( '*' atomExp | '/' atomExp )*

            for (;;)
            {
                int alt2=3;
                switch ( LA(1) )
                {
                case 8:
                	{
                		alt2=1;
                	}
                    break;
                case 11:
                	{
                		alt2=2;
                	}
                    break;

                }

                switch (alt2)
                {
            	case 1:
            	    // Expr.g:23:12: '*' atomExp
            	    {
            	         MATCHT(8, &FOLLOW_8_in_multiplyExp137);
            	        if  (HASEXCEPTION())
            	        {
            	            goto rulemultiplyExpEx;
            	        }


            	        FOLLOWPUSH(FOLLOW_atomExp_in_multiplyExp139);
            	        atomExp(ctx);

            	        FOLLOWPOP();
            	        if  (HASEXCEPTION())
            	        {
            	            goto rulemultiplyExpEx;
            	        }


            	    }
            	    break;
            	case 2:
            	    // Expr.g:24:12: '/' atomExp
            	    {
            	         MATCHT(11, &FOLLOW_11_in_multiplyExp153);
            	        if  (HASEXCEPTION())
            	        {
            	            goto rulemultiplyExpEx;
            	        }


            	        FOLLOWPUSH(FOLLOW_atomExp_in_multiplyExp155);
            	        atomExp(ctx);

            	        FOLLOWPOP();
            	        if  (HASEXCEPTION())
            	        {
            	            goto rulemultiplyExpEx;
            	        }


            	    }
            	    break;

            	default:
            	    goto loop2;	/* break out of the loop */
            	    break;
                }
            }
            loop2: ; /* Jump out to here if this rule does not match */


        }

    }

    // This is where rules clean up and exit
    //
    goto rulemultiplyExpEx; /* Prevent compiler warnings */
    rulemultiplyExpEx: ;

            if (HASEXCEPTION())
            {
                PREPORTERROR();
                PRECOVER();
            }
    return ;
}
/* $ANTLR end multiplyExp */

/**
 * $ANTLR start atomExp
 * Expr.g:31:1: atomExp : ( Number | '(' additionExp ')' );
 */
static void
atomExp(pExprParser ctx)
{
    /* Initialize rule variables
     */

    {
        {
            //  Expr.g:32:5: ( Number | '(' additionExp ')' )

            ANTLR3_UINT32 alt3;

            alt3=2;

            switch ( LA(1) )
            {
            case Number:
            	{
            		alt3=1;
            	}
                break;
            case 6:
            	{
            		alt3=2;
            	}
                break;

            default:
                CONSTRUCTEX();
                EXCEPTION->type         = ANTLR3_NO_VIABLE_ALT_EXCEPTION;
                EXCEPTION->message      = (void *)"";
                EXCEPTION->decisionNum  = 3;
                EXCEPTION->state        = 0;


                goto ruleatomExpEx;

            }

            switch (alt3)
            {
        	case 1:
        	    // Expr.g:32:10: Number
        	    {
        	         MATCHT(Number, &FOLLOW_Number_in_atomExp190);
        	        if  (HASEXCEPTION())
        	        {
        	            goto ruleatomExpEx;
        	        }


        	    }
        	    break;
        	case 2:
        	    // Expr.g:33:15: '(' additionExp ')'
        	    {
        	         MATCHT(6, &FOLLOW_6_in_atomExp206);
        	        if  (HASEXCEPTION())
        	        {
        	            goto ruleatomExpEx;
        	        }


        	        FOLLOWPUSH(FOLLOW_additionExp_in_atomExp208);
        	        additionExp(ctx);

        	        FOLLOWPOP();
        	        if  (HASEXCEPTION())
        	        {
        	            goto ruleatomExpEx;
        	        }


        	         MATCHT(7, &FOLLOW_7_in_atomExp210);
        	        if  (HASEXCEPTION())
        	        {
        	            goto ruleatomExpEx;
        	        }


        	    }
        	    break;

            }
        }
    }

    // This is where rules clean up and exit
    //
    goto ruleatomExpEx; /* Prevent compiler warnings */
    ruleatomExpEx: ;

            if (HASEXCEPTION())
            {
                PREPORTERROR();
                PRECOVER();
            }
    return ;
}
/* $ANTLR end atomExp */
/* End of parsing rules
 * ==============================================
 */

/* ==============================================
 * Syntactic predicates
 */
/* End of syntactic predicates
 * ==============================================
 */






/* End of code
 * =============================================================================
 */
