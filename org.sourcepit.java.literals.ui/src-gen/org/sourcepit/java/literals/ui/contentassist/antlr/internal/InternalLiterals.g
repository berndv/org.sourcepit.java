/*
* generated by Xtext
*/
grammar InternalLiterals;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package org.sourcepit.java.literals.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.sourcepit.java.literals.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.sourcepit.java.literals.services.LiteralsGrammarAccess;

}

@parser::members {
 
 	private LiteralsGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(LiteralsGrammarAccess grammarAccess) {
    	this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected Grammar getGrammar() {
    	return grammarAccess.getGrammar();
    }
    
    @Override
    protected String getValueForTokenName(String tokenName) {
    	return tokenName;
    }

}




// Entry rule entryRuleFoo
entryRuleFoo 
:
{ before(grammarAccess.getFooRule()); }
	 ruleFoo
{ after(grammarAccess.getFooRule()); } 
	 EOF 
;

// Rule Foo
ruleFoo
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getFooAccess().getGroup()); }
(rule__Foo__Group__0)
{ after(grammarAccess.getFooAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleliteral
entryRuleliteral 
:
{ before(grammarAccess.getLiteralRule()); }
	 ruleliteral
{ after(grammarAccess.getLiteralRule()); } 
	 EOF 
;

// Rule literal
ruleliteral
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getLiteralAccess().getAlternatives()); }
(rule__Literal__Alternatives)
{ after(grammarAccess.getLiteralAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleIntegerLiteral
entryRuleIntegerLiteral 
:
{ before(grammarAccess.getIntegerLiteralRule()); }
	 ruleIntegerLiteral
{ after(grammarAccess.getIntegerLiteralRule()); } 
	 EOF 
;

// Rule IntegerLiteral
ruleIntegerLiteral
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getIntegerLiteralAccess().getValueAssignment()); }
(rule__IntegerLiteral__ValueAssignment)
{ after(grammarAccess.getIntegerLiteralAccess().getValueAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleFloatingPointLiteral
entryRuleFloatingPointLiteral 
:
{ before(grammarAccess.getFloatingPointLiteralRule()); }
	 ruleFloatingPointLiteral
{ after(grammarAccess.getFloatingPointLiteralRule()); } 
	 EOF 
;

// Rule FloatingPointLiteral
ruleFloatingPointLiteral
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getFloatingPointLiteralAccess().getValueAssignment()); }
(rule__FloatingPointLiteral__ValueAssignment)
{ after(grammarAccess.getFloatingPointLiteralAccess().getValueAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleBooleanLiteral
entryRuleBooleanLiteral 
:
{ before(grammarAccess.getBooleanLiteralRule()); }
	 ruleBooleanLiteral
{ after(grammarAccess.getBooleanLiteralRule()); } 
	 EOF 
;

// Rule BooleanLiteral
ruleBooleanLiteral
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getBooleanLiteralAccess().getValueAssignment()); }
(rule__BooleanLiteral__ValueAssignment)
{ after(grammarAccess.getBooleanLiteralAccess().getValueAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleCharacterLiteral
entryRuleCharacterLiteral 
:
{ before(grammarAccess.getCharacterLiteralRule()); }
	 ruleCharacterLiteral
{ after(grammarAccess.getCharacterLiteralRule()); } 
	 EOF 
;

// Rule CharacterLiteral
ruleCharacterLiteral
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getCharacterLiteralAccess().getValueAssignment()); }
(rule__CharacterLiteral__ValueAssignment)
{ after(grammarAccess.getCharacterLiteralAccess().getValueAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleStringLiteral
entryRuleStringLiteral 
:
{ before(grammarAccess.getStringLiteralRule()); }
	 ruleStringLiteral
{ after(grammarAccess.getStringLiteralRule()); } 
	 EOF 
;

// Rule StringLiteral
ruleStringLiteral
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getStringLiteralAccess().getValueAssignment()); }
(rule__StringLiteral__ValueAssignment)
{ after(grammarAccess.getStringLiteralAccess().getValueAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleNullLiteral
entryRuleNullLiteral 
:
{ before(grammarAccess.getNullLiteralRule()); }
	 ruleNullLiteral
{ after(grammarAccess.getNullLiteralRule()); } 
	 EOF 
;

// Rule NullLiteral
ruleNullLiteral
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getNullLiteralAccess().getValueAssignment()); }
(rule__NullLiteral__ValueAssignment)
{ after(grammarAccess.getNullLiteralAccess().getValueAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}




rule__Literal__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLiteralAccess().getIntegerLiteralParserRuleCall_0()); }
	ruleIntegerLiteral
{ after(grammarAccess.getLiteralAccess().getIntegerLiteralParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getLiteralAccess().getFloatingPointLiteralParserRuleCall_1()); }
	ruleFloatingPointLiteral
{ after(grammarAccess.getLiteralAccess().getFloatingPointLiteralParserRuleCall_1()); }
)

    |(
{ before(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_2()); }
	ruleBooleanLiteral
{ after(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_2()); }
)

    |(
{ before(grammarAccess.getLiteralAccess().getCharacterLiteralParserRuleCall_3()); }
	ruleCharacterLiteral
{ after(grammarAccess.getLiteralAccess().getCharacterLiteralParserRuleCall_3()); }
)

    |(
{ before(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_4()); }
	ruleStringLiteral
{ after(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_4()); }
)

    |(
{ before(grammarAccess.getLiteralAccess().getNullLiteralParserRuleCall_5()); }
	ruleNullLiteral
{ after(grammarAccess.getLiteralAccess().getNullLiteralParserRuleCall_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerLiteral__ValueAlternatives_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIntegerLiteralAccess().getValueDecimalIntegerLiteralTerminalRuleCall_0_0()); }
	RULE_DECIMALINTEGERLITERAL
{ after(grammarAccess.getIntegerLiteralAccess().getValueDecimalIntegerLiteralTerminalRuleCall_0_0()); }
)

    |(
{ before(grammarAccess.getIntegerLiteralAccess().getValueHexIntegerLiteralTerminalRuleCall_0_1()); }
	RULE_HEXINTEGERLITERAL
{ after(grammarAccess.getIntegerLiteralAccess().getValueHexIntegerLiteralTerminalRuleCall_0_1()); }
)

    |(
{ before(grammarAccess.getIntegerLiteralAccess().getValueOctalIntegerLiteralTerminalRuleCall_0_2()); }
	RULE_OCTALINTEGERLITERAL
{ after(grammarAccess.getIntegerLiteralAccess().getValueOctalIntegerLiteralTerminalRuleCall_0_2()); }
)

    |(
{ before(grammarAccess.getIntegerLiteralAccess().getValueBinaryIntegerLiteralTerminalRuleCall_0_3()); }
	RULE_BINARYINTEGERLITERAL
{ after(grammarAccess.getIntegerLiteralAccess().getValueBinaryIntegerLiteralTerminalRuleCall_0_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__FloatingPointLiteral__ValueAlternatives_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFloatingPointLiteralAccess().getValueDecimalFloatingPointLiteralTerminalRuleCall_0_0()); }
	RULE_DECIMALFLOATINGPOINTLITERAL
{ after(grammarAccess.getFloatingPointLiteralAccess().getValueDecimalFloatingPointLiteralTerminalRuleCall_0_0()); }
)

    |(
{ before(grammarAccess.getFloatingPointLiteralAccess().getValueHexadecimalFloatingPointLiteralTerminalRuleCall_0_1()); }
	RULE_HEXADECIMALFLOATINGPOINTLITERAL
{ after(grammarAccess.getFloatingPointLiteralAccess().getValueHexadecimalFloatingPointLiteralTerminalRuleCall_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanLiteral__ValueAlternatives_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBooleanLiteralAccess().getValueTRUETerminalRuleCall_0_0()); }
	RULE_TRUE
{ after(grammarAccess.getBooleanLiteralAccess().getValueTRUETerminalRuleCall_0_0()); }
)

    |(
{ before(grammarAccess.getBooleanLiteralAccess().getValueFALSETerminalRuleCall_0_1()); }
	RULE_FALSE
{ after(grammarAccess.getBooleanLiteralAccess().getValueFALSETerminalRuleCall_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__Foo__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Foo__Group__0__Impl
	rule__Foo__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Foo__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFooAccess().getCommercialAtKeyword_0()); }

	'@' 

{ after(grammarAccess.getFooAccess().getCommercialAtKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Foo__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Foo__Group__1__Impl
	rule__Foo__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Foo__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFooAccess().getLiteralParserRuleCall_1()); }
	ruleliteral
{ after(grammarAccess.getFooAccess().getLiteralParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Foo__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Foo__Group__2__Impl
	rule__Foo__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Foo__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFooAccess().getPublicKeyword_2()); }

	'public' 

{ after(grammarAccess.getFooAccess().getPublicKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Foo__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Foo__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Foo__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFooAccess().getIdentifierTerminalRuleCall_3()); }
	RULE_IDENTIFIER
{ after(grammarAccess.getFooAccess().getIdentifierTerminalRuleCall_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}











rule__IntegerLiteral__ValueAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIntegerLiteralAccess().getValueAlternatives_0()); }
(rule__IntegerLiteral__ValueAlternatives_0)
{ after(grammarAccess.getIntegerLiteralAccess().getValueAlternatives_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__FloatingPointLiteral__ValueAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFloatingPointLiteralAccess().getValueAlternatives_0()); }
(rule__FloatingPointLiteral__ValueAlternatives_0)
{ after(grammarAccess.getFloatingPointLiteralAccess().getValueAlternatives_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanLiteral__ValueAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBooleanLiteralAccess().getValueAlternatives_0()); }
(rule__BooleanLiteral__ValueAlternatives_0)
{ after(grammarAccess.getBooleanLiteralAccess().getValueAlternatives_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__CharacterLiteral__ValueAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCharacterLiteralAccess().getValueCHARACTERTerminalRuleCall_0()); }
	RULE_CHARACTER{ after(grammarAccess.getCharacterLiteralAccess().getValueCHARACTERTerminalRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__StringLiteral__ValueAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); }
	RULE_STRING{ after(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__NullLiteral__ValueAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNullLiteralAccess().getValueNULLTerminalRuleCall_0()); }
	RULE_NULL{ after(grammarAccess.getNullLiteralAccess().getValueNULLTerminalRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_DECIMALINTEGERLITERAL : RULE_DECIMALNUMERAL RULE_INTEGERTYPESUFFIX?;

RULE_HEXINTEGERLITERAL : RULE_HEXNUMERAL RULE_INTEGERTYPESUFFIX?;

RULE_OCTALINTEGERLITERAL : RULE_OCTALNUMERAL RULE_INTEGERTYPESUFFIX?;

RULE_BINARYINTEGERLITERAL : RULE_BINARYNUMERAL RULE_INTEGERTYPESUFFIX?;

fragment RULE_INTEGERTYPESUFFIX : ('l'|'L');

fragment RULE_DECIMALNUMERAL : ('0'|RULE_NONZERODIGIT RULE_DIGITS?|RULE_NONZERODIGIT RULE_UNDERSCORES RULE_DIGITS);

fragment RULE_NONZERODIGIT : '1'..'9';

fragment RULE_DIGITS : (RULE_DIGIT|RULE_DIGIT RULE_DIGITSANDUNDERSCORES? RULE_DIGIT);

fragment RULE_DIGIT : ('0'|RULE_NONZERODIGIT);

fragment RULE_DIGITSANDUNDERSCORES : RULE_DIGITORUNDERSCORE RULE_DIGITORUNDERSCORE*;

fragment RULE_DIGITORUNDERSCORE : (RULE_DIGIT|'_');

fragment RULE_UNDERSCORES : '_'+;

fragment RULE_HEXNUMERAL : '0' ('x'|'X') RULE_HEXDIGITS;

fragment RULE_HEXDIGITS : (RULE_HEXDIGIT|RULE_HEXDIGIT RULE_HEXDIGITSANDUNDERSCORES? RULE_HEXDIGIT);

fragment RULE_HEXDIGIT : ('0'..'9'|'a'..'f'|'A'..'F');

fragment RULE_HEXDIGITSANDUNDERSCORES : RULE_HEXDIGITORUNDERSCORE RULE_HEXDIGITORUNDERSCORE*;

fragment RULE_HEXDIGITORUNDERSCORE : (RULE_HEXDIGIT|'_');

fragment RULE_OCTALNUMERAL : ('0' RULE_OCTALDIGITS|'0' RULE_UNDERSCORES RULE_OCTALDIGITS);

fragment RULE_OCTALDIGITS : (RULE_OCTALDIGIT|RULE_OCTALDIGIT RULE_OCTALDIGITSANDUNDERSCORES? RULE_OCTALDIGIT);

fragment RULE_OCTALDIGIT : '0'..'7';

fragment RULE_OCTALDIGITSANDUNDERSCORES : RULE_OCTALDIGITORUNDERSCORE RULE_OCTALDIGITORUNDERSCORE*;

fragment RULE_OCTALDIGITORUNDERSCORE : (RULE_OCTALDIGIT|'_');

fragment RULE_BINARYNUMERAL : '0' ('b'|'B') RULE_BINARYDIGITS;

fragment RULE_BINARYDIGITS : (RULE_BINARYDIGIT|RULE_BINARYDIGIT RULE_BINARYDIGITSANDUNDERSCORES? RULE_BINARYDIGIT);

fragment RULE_BINARYDIGIT : ('0'|'1');

fragment RULE_BINARYDIGITSANDUNDERSCORES : RULE_BINARYDIGITORUNDERSCORE RULE_BINARYDIGITORUNDERSCORE*;

fragment RULE_BINARYDIGITORUNDERSCORE : (RULE_BINARYDIGIT|'_');

RULE_DECIMALFLOATINGPOINTLITERAL : (RULE_DIGITS '.' RULE_DIGITS? RULE_EXPONENTPART? RULE_FLOATTYPESUFFIX?|'.' RULE_DIGITS RULE_EXPONENTPART? RULE_FLOATTYPESUFFIX?|RULE_DIGITS RULE_EXPONENTPART RULE_FLOATTYPESUFFIX?|RULE_DIGITS RULE_FLOATTYPESUFFIX);

fragment RULE_EXPONENTPART : RULE_EXPONENTINDICATOR RULE_SIGNEDINTEGER;

fragment RULE_EXPONENTINDICATOR : ('e'|'E');

fragment RULE_SIGNEDINTEGER : RULE_SIGN? RULE_DIGITS;

fragment RULE_SIGN : ('+'|'-');

fragment RULE_FLOATTYPESUFFIX : ('f'|'F'|'d'|'D');

RULE_HEXADECIMALFLOATINGPOINTLITERAL : RULE_HEXSIGNIFICAND RULE_BINARYEXPONENT RULE_FLOATTYPESUFFIX?;

fragment RULE_HEXSIGNIFICAND : (RULE_HEXNUMERAL '.'?|'0' ('x'|'X') RULE_HEXDIGIT* '.' RULE_HEXDIGIT+);

fragment RULE_BINARYEXPONENT : RULE_BINARYEXPONENTINDICATOR RULE_SIGNEDINTEGER;

fragment RULE_BINARYEXPONENTINDICATOR : ('p'|'P');

RULE_TRUE : 'true';

RULE_FALSE : 'false';

RULE_CHARACTER : '\'' (RULE_ESCAPESEQUENCE|~(('\''|'\\'))) '\'';

RULE_STRING : '"' (RULE_ESCAPESEQUENCE|~(('\\'|'"')))* '"';

fragment RULE_ESCAPESEQUENCE : ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|RULE_UNICODEESCAPE|RULE_OCTALESCAPE);

fragment RULE_OCTALESCAPE : ('\\' RULE_ZEROTOTHREE RULE_OCTALDIGIT RULE_OCTALDIGIT|'\\' RULE_OCTALDIGIT RULE_OCTALDIGIT|'\\' RULE_OCTALDIGIT);

fragment RULE_ZEROTOTHREE : '0'..'3';

fragment RULE_UNICODEESCAPE : '\\' RULE_UNICODEMARKER RULE_HEXDIGIT RULE_HEXDIGIT RULE_HEXDIGIT RULE_HEXDIGIT;

fragment RULE_UNICODEMARKER : 'u' 'u'*;

RULE_NULL : 'null';

RULE_IDENTIFIER : RULE_JAVALETTER RULE_JAVALETTERORDIGIT*;

fragment RULE_JAVALETTER : ('$'|'A'..'Z'|'_'|'a'..'z'|'\u00A2'..'\u00A5'|'\u00AA'|'\u00B5'|'\u00BA'|'\u00C0'..'\u00D6'|'\u00D8'..'\u00F6'|'\u00F8'..'\u0236'|'\u0250'..'\u02C1'|'\u02C6'..'\u02D1'|'\u02E0'..'\u02E4'|'\u02EE'|'\u037A'|'\u0386'|'\u0388'..'\u038A'|'\u038C'|'\u038E'..'\u03A1'|'\u03A3'..'\u03CE'|'\u03D0'..'\u03F5'|'\u03F7'..'\u03FB'|'\u0400'..'\u0481'|'\u048A'..'\u04CE'|'\u04D0'..'\u04F5'|'\u04F8'..'\u04F9'|'\u0500'..'\u050F'|'\u0531'..'\u0556'|'\u0559'|'\u0561'..'\u0587'|'\u05D0'..'\u05EA'|'\u05F0'..'\u05F2'|'\u0621'..'\u063A'|'\u0640'..'\u064A'|'\u066E'..'\u066F'|'\u0671'..'\u06D3'|'\u06D5'|'\u06E5'..'\u06E6'|'\u06EE'..'\u06EF'|'\u06FA'..'\u06FC'|'\u06FF'|'\u0710'|'\u0712'..'\u072F'|'\u074D'..'\u074F'|'\u0780'..'\u07A5'|'\u07B1'|'\u0904'..'\u0939'|'\u093D'|'\u0950'|'\u0958'..'\u0961'|'\u0985'..'\u098C'|'\u098F'..'\u0990'|'\u0993'..'\u09A8'|'\u09AA'..'\u09B0'|'\u09B2'|'\u09B6'..'\u09B9'|'\u09BD'|'\u09DC'..'\u09DD'|'\u09DF'..'\u09E1'|'\u09F0'..'\u09F3'|'\u0A05'..'\u0A0A'|'\u0A0F'..'\u0A10'|'\u0A13'..'\u0A28'|'\u0A2A'..'\u0A30'|'\u0A32'..'\u0A33'|'\u0A35'..'\u0A36'|'\u0A38'..'\u0A39'|'\u0A59'..'\u0A5C'|'\u0A5E'|'\u0A72'..'\u0A74'|'\u0A85'..'\u0A8D'|'\u0A8F'..'\u0A91'|'\u0A93'..'\u0AA8'|'\u0AAA'..'\u0AB0'|'\u0AB2'..'\u0AB3'|'\u0AB5'..'\u0AB9'|'\u0ABD'|'\u0AD0'|'\u0AE0'..'\u0AE1'|'\u0AF1'|'\u0B05'..'\u0B0C'|'\u0B0F'..'\u0B10'|'\u0B13'..'\u0B28'|'\u0B2A'..'\u0B30'|'\u0B32'..'\u0B33'|'\u0B35'..'\u0B39'|'\u0B3D'|'\u0B5C'..'\u0B5D'|'\u0B5F'..'\u0B61'|'\u0B71'|'\u0B83'|'\u0B85'..'\u0B8A'|'\u0B8E'..'\u0B90'|'\u0B92'..'\u0B95'|'\u0B99'..'\u0B9A'|'\u0B9C'|'\u0B9E'..'\u0B9F'|'\u0BA3'..'\u0BA4'|'\u0BA8'..'\u0BAA'|'\u0BAE'..'\u0BB5'|'\u0BB7'..'\u0BB9'|'\u0BF9'|'\u0C05'..'\u0C0C'|'\u0C0E'..'\u0C10'|'\u0C12'..'\u0C28'|'\u0C2A'..'\u0C33'|'\u0C35'..'\u0C39'|'\u0C60'..'\u0C61'|'\u0C85'..'\u0C8C'|'\u0C8E'..'\u0C90'|'\u0C92'..'\u0CA8'|'\u0CAA'..'\u0CB3'|'\u0CB5'..'\u0CB9'|'\u0CBD'|'\u0CDE'|'\u0CE0'..'\u0CE1'|'\u0D05'..'\u0D0C'|'\u0D0E'..'\u0D10'|'\u0D12'..'\u0D28'|'\u0D2A'..'\u0D39'|'\u0D60'..'\u0D61'|'\u0D85'..'\u0D96'|'\u0D9A'..'\u0DB1'|'\u0DB3'..'\u0DBB'|'\u0DBD'|'\u0DC0'..'\u0DC6'|'\u0E01'..'\u0E30'|'\u0E32'..'\u0E33'|'\u0E3F'..'\u0E46'|'\u0E81'..'\u0E82'|'\u0E84'|'\u0E87'..'\u0E88'|'\u0E8A'|'\u0E8D'|'\u0E94'..'\u0E97'|'\u0E99'..'\u0E9F'|'\u0EA1'..'\u0EA3'|'\u0EA5'|'\u0EA7'|'\u0EAA'..'\u0EAB'|'\u0EAD'..'\u0EB0'|'\u0EB2'..'\u0EB3'|'\u0EBD'|'\u0EC0'..'\u0EC4'|'\u0EC6'|'\u0EDC'..'\u0EDD'|'\u0F00'|'\u0F40'..'\u0F47'|'\u0F49'..'\u0F6A'|'\u0F88'..'\u0F8B'|'\u1000'..'\u1021'|'\u1023'..'\u1027'|'\u1029'..'\u102A'|'\u1050'..'\u1055'|'\u10A0'..'\u10C5'|'\u10D0'..'\u10F8'|'\u1100'..'\u1159'|'\u115F'..'\u11A2'|'\u11A8'..'\u11F9'|'\u1200'..'\u1206'|'\u1208'..'\u1246'|'\u1248'|'\u124A'..'\u124D'|'\u1250'..'\u1256'|'\u1258'|'\u125A'..'\u125D'|'\u1260'..'\u1286'|'\u1288'|'\u128A'..'\u128D'|'\u1290'..'\u12AE'|'\u12B0'|'\u12B2'..'\u12B5'|'\u12B8'..'\u12BE'|'\u12C0'|'\u12C2'..'\u12C5'|'\u12C8'..'\u12CE'|'\u12D0'..'\u12D6'|'\u12D8'..'\u12EE'|'\u12F0'..'\u130E'|'\u1310'|'\u1312'..'\u1315'|'\u1318'..'\u131E'|'\u1320'..'\u1346'|'\u1348'..'\u135A'|'\u13A0'..'\u13F4'|'\u1401'..'\u166C'|'\u166F'..'\u1676'|'\u1681'..'\u169A'|'\u16A0'..'\u16EA'|'\u16EE'..'\u16F0'|'\u1700'..'\u170C'|'\u170E'..'\u1711'|'\u1720'..'\u1731'|'\u1740'..'\u1751'|'\u1760'..'\u176C'|'\u176E'..'\u1770'|'\u1780'..'\u17B3'|'\u17D7'|'\u17DB'..'\u17DC'|'\u1820'..'\u1877'|'\u1880'..'\u18A8'|'\u1900'..'\u191C'|'\u1950'..'\u196D'|'\u1970'..'\u1974'|'\u1D00'..'\u1D6B'|'\u1E00'..'\u1E9B'|'\u1EA0'..'\u1EF9'|'\u1F00'..'\u1F15'|'\u1F18'..'\u1F1D'|'\u1F20'..'\u1F45'|'\u1F48'..'\u1F4D'|'\u1F50'..'\u1F57'|'\u1F59'|'\u1F5B'|'\u1F5D'|'\u1F5F'..'\u1F7D'|'\u1F80'..'\u1FB4'|'\u1FB6'..'\u1FBC'|'\u1FBE'|'\u1FC2'..'\u1FC4'|'\u1FC6'..'\u1FCC'|'\u1FD0'..'\u1FD3'|'\u1FD6'..'\u1FDB'|'\u1FE0'..'\u1FEC'|'\u1FF2'..'\u1FF4'|'\u1FF6'..'\u1FFC'|'\u203F'..'\u2040'|'\u2054'|'\u2071'|'\u207F'|'\u20A0'..'\u20B1'|'\u2102'|'\u2107'|'\u210A'..'\u2113'|'\u2115'|'\u2119'..'\u211D'|'\u2124'|'\u2126'|'\u2128'|'\u212A'..'\u212D'|'\u212F'..'\u2131'|'\u2133'..'\u2139'|'\u213D'..'\u213F'|'\u2145'..'\u2149'|'\u2160'..'\u2183'|'\u3005'..'\u3007'|'\u3021'..'\u3029'|'\u3031'..'\u3035'|'\u3038'..'\u303C'|'\u3041'..'\u3096'|'\u309D'..'\u309F'|'\u30A1'..'\u30FF'|'\u3105'..'\u312C'|'\u3131'..'\u318E'|'\u31A0'..'\u31B7'|'\u31F0'..'\u31FF'|'\u3400'..'\u4DB5'|'\u4E00'..'\u9FA5'|'\uA000'..'\uA48C'|'\uAC00'..'\uD7A3'|'\uF900'..'\uFA2D'|'\uFA30'..'\uFA6A'|'\uFB00'..'\uFB06'|'\uFB13'..'\uFB17'|'\uFB1D'|'\uFB1F'..'\uFB28'|'\uFB2A'..'\uFB36'|'\uFB38'..'\uFB3C'|'\uFB3E'|'\uFB40'..'\uFB41'|'\uFB43'..'\uFB44'|'\uFB46'..'\uFBB1'|'\uFBD3'..'\uFD3D'|'\uFD50'..'\uFD8F'|'\uFD92'..'\uFDC7'|'\uFDF0'..'\uFDFC'|'\uFE33'..'\uFE34'|'\uFE4D'..'\uFE4F'|'\uFE69'|'\uFE70'..'\uFE74'|'\uFE76'..'\uFEFC'|'\uFF04'|'\uFF21'..'\uFF3A'|'\uFF3F'|'\uFF41'..'\uFF5A'|'\uFF65'..'\uFFBE'|'\uFFC2'..'\uFFC7'|'\uFFCA'..'\uFFCF'|'\uFFD2'..'\uFFD7'|'\uFFDA'..'\uFFDC'|'\uFFE0'..'\uFFE1'|'\uFFE5'..'\uFFE6'|'\uD800'..'\uDBFF' '\uDC00'..'\uDFFF');

fragment RULE_JAVALETTERORDIGIT : ('\u0000'..'\b'|'\u000E'..'\u001B'|'$'|'0'..'9'|'A'..'Z'|'_'|'a'..'z'|'\u007F'..'\u009F'|'\u00A2'..'\u00A5'|'\u00AA'|'\u00AD'|'\u00B5'|'\u00BA'|'\u00C0'..'\u00D6'|'\u00D8'..'\u00F6'|'\u00F8'..'\u0236'|'\u0250'..'\u02C1'|'\u02C6'..'\u02D1'|'\u02E0'..'\u02E4'|'\u02EE'|'\u0300'..'\u0357'|'\u035D'..'\u036F'|'\u037A'|'\u0386'|'\u0388'..'\u038A'|'\u038C'|'\u038E'..'\u03A1'|'\u03A3'..'\u03CE'|'\u03D0'..'\u03F5'|'\u03F7'..'\u03FB'|'\u0400'..'\u0481'|'\u0483'..'\u0486'|'\u048A'..'\u04CE'|'\u04D0'..'\u04F5'|'\u04F8'..'\u04F9'|'\u0500'..'\u050F'|'\u0531'..'\u0556'|'\u0559'|'\u0561'..'\u0587'|'\u0591'..'\u05A1'|'\u05A3'..'\u05B9'|'\u05BB'..'\u05BD'|'\u05BF'|'\u05C1'..'\u05C2'|'\u05C4'|'\u05D0'..'\u05EA'|'\u05F0'..'\u05F2'|'\u0600'..'\u0603'|'\u0610'..'\u0615'|'\u0621'..'\u063A'|'\u0640'..'\u0658'|'\u0660'..'\u0669'|'\u066E'..'\u06D3'|'\u06D5'..'\u06DD'|'\u06DF'..'\u06E8'|'\u06EA'..'\u06FC'|'\u06FF'|'\u070F'..'\u074A'|'\u074D'..'\u074F'|'\u0780'..'\u07B1'|'\u0901'..'\u0939'|'\u093C'..'\u094D'|'\u0950'..'\u0954'|'\u0958'..'\u0963'|'\u0966'..'\u096F'|'\u0981'..'\u0983'|'\u0985'..'\u098C'|'\u098F'..'\u0990'|'\u0993'..'\u09A8'|'\u09AA'..'\u09B0'|'\u09B2'|'\u09B6'..'\u09B9'|'\u09BC'..'\u09C4'|'\u09C7'..'\u09C8'|'\u09CB'..'\u09CD'|'\u09D7'|'\u09DC'..'\u09DD'|'\u09DF'..'\u09E3'|'\u09E6'..'\u09F3'|'\u0A01'..'\u0A03'|'\u0A05'..'\u0A0A'|'\u0A0F'..'\u0A10'|'\u0A13'..'\u0A28'|'\u0A2A'..'\u0A30'|'\u0A32'..'\u0A33'|'\u0A35'..'\u0A36'|'\u0A38'..'\u0A39'|'\u0A3C'|'\u0A3E'..'\u0A42'|'\u0A47'..'\u0A48'|'\u0A4B'..'\u0A4D'|'\u0A59'..'\u0A5C'|'\u0A5E'|'\u0A66'..'\u0A74'|'\u0A81'..'\u0A83'|'\u0A85'..'\u0A8D'|'\u0A8F'..'\u0A91'|'\u0A93'..'\u0AA8'|'\u0AAA'..'\u0AB0'|'\u0AB2'..'\u0AB3'|'\u0AB5'..'\u0AB9'|'\u0ABC'..'\u0AC5'|'\u0AC7'..'\u0AC9'|'\u0ACB'..'\u0ACD'|'\u0AD0'|'\u0AE0'..'\u0AE3'|'\u0AE6'..'\u0AEF'|'\u0AF1'|'\u0B01'..'\u0B03'|'\u0B05'..'\u0B0C'|'\u0B0F'..'\u0B10'|'\u0B13'..'\u0B28'|'\u0B2A'..'\u0B30'|'\u0B32'..'\u0B33'|'\u0B35'..'\u0B39'|'\u0B3C'..'\u0B43'|'\u0B47'..'\u0B48'|'\u0B4B'..'\u0B4D'|'\u0B56'..'\u0B57'|'\u0B5C'..'\u0B5D'|'\u0B5F'..'\u0B61'|'\u0B66'..'\u0B6F'|'\u0B71'|'\u0B82'..'\u0B83'|'\u0B85'..'\u0B8A'|'\u0B8E'..'\u0B90'|'\u0B92'..'\u0B95'|'\u0B99'..'\u0B9A'|'\u0B9C'|'\u0B9E'..'\u0B9F'|'\u0BA3'..'\u0BA4'|'\u0BA8'..'\u0BAA'|'\u0BAE'..'\u0BB5'|'\u0BB7'..'\u0BB9'|'\u0BBE'..'\u0BC2'|'\u0BC6'..'\u0BC8'|'\u0BCA'..'\u0BCD'|'\u0BD7'|'\u0BE7'..'\u0BEF'|'\u0BF9'|'\u0C01'..'\u0C03'|'\u0C05'..'\u0C0C'|'\u0C0E'..'\u0C10'|'\u0C12'..'\u0C28'|'\u0C2A'..'\u0C33'|'\u0C35'..'\u0C39'|'\u0C3E'..'\u0C44'|'\u0C46'..'\u0C48'|'\u0C4A'..'\u0C4D'|'\u0C55'..'\u0C56'|'\u0C60'..'\u0C61'|'\u0C66'..'\u0C6F'|'\u0C82'..'\u0C83'|'\u0C85'..'\u0C8C'|'\u0C8E'..'\u0C90'|'\u0C92'..'\u0CA8'|'\u0CAA'..'\u0CB3'|'\u0CB5'..'\u0CB9'|'\u0CBC'..'\u0CC4'|'\u0CC6'..'\u0CC8'|'\u0CCA'..'\u0CCD'|'\u0CD5'..'\u0CD6'|'\u0CDE'|'\u0CE0'..'\u0CE1'|'\u0CE6'..'\u0CEF'|'\u0D02'..'\u0D03'|'\u0D05'..'\u0D0C'|'\u0D0E'..'\u0D10'|'\u0D12'..'\u0D28'|'\u0D2A'..'\u0D39'|'\u0D3E'..'\u0D43'|'\u0D46'..'\u0D48'|'\u0D4A'..'\u0D4D'|'\u0D57'|'\u0D60'..'\u0D61'|'\u0D66'..'\u0D6F'|'\u0D82'..'\u0D83'|'\u0D85'..'\u0D96'|'\u0D9A'..'\u0DB1'|'\u0DB3'..'\u0DBB'|'\u0DBD'|'\u0DC0'..'\u0DC6'|'\u0DCA'|'\u0DCF'..'\u0DD4'|'\u0DD6'|'\u0DD8'..'\u0DDF'|'\u0DF2'..'\u0DF3'|'\u0E01'..'\u0E3A'|'\u0E3F'..'\u0E4E'|'\u0E50'..'\u0E59'|'\u0E81'..'\u0E82'|'\u0E84'|'\u0E87'..'\u0E88'|'\u0E8A'|'\u0E8D'|'\u0E94'..'\u0E97'|'\u0E99'..'\u0E9F'|'\u0EA1'..'\u0EA3'|'\u0EA5'|'\u0EA7'|'\u0EAA'..'\u0EAB'|'\u0EAD'..'\u0EB9'|'\u0EBB'..'\u0EBD'|'\u0EC0'..'\u0EC4'|'\u0EC6'|'\u0EC8'..'\u0ECD'|'\u0ED0'..'\u0ED9'|'\u0EDC'..'\u0EDD'|'\u0F00'|'\u0F18'..'\u0F19'|'\u0F20'..'\u0F29'|'\u0F35'|'\u0F37'|'\u0F39'|'\u0F3E'..'\u0F47'|'\u0F49'..'\u0F6A'|'\u0F71'..'\u0F84'|'\u0F86'..'\u0F8B'|'\u0F90'..'\u0F97'|'\u0F99'..'\u0FBC'|'\u0FC6'|'\u1000'..'\u1021'|'\u1023'..'\u1027'|'\u1029'..'\u102A'|'\u102C'..'\u1032'|'\u1036'..'\u1039'|'\u1040'..'\u1049'|'\u1050'..'\u1059'|'\u10A0'..'\u10C5'|'\u10D0'..'\u10F8'|'\u1100'..'\u1159'|'\u115F'..'\u11A2'|'\u11A8'..'\u11F9'|'\u1200'..'\u1206'|'\u1208'..'\u1246'|'\u1248'|'\u124A'..'\u124D'|'\u1250'..'\u1256'|'\u1258'|'\u125A'..'\u125D'|'\u1260'..'\u1286'|'\u1288'|'\u128A'..'\u128D'|'\u1290'..'\u12AE'|'\u12B0'|'\u12B2'..'\u12B5'|'\u12B8'..'\u12BE'|'\u12C0'|'\u12C2'..'\u12C5'|'\u12C8'..'\u12CE'|'\u12D0'..'\u12D6'|'\u12D8'..'\u12EE'|'\u12F0'..'\u130E'|'\u1310'|'\u1312'..'\u1315'|'\u1318'..'\u131E'|'\u1320'..'\u1346'|'\u1348'..'\u135A'|'\u1369'..'\u1371'|'\u13A0'..'\u13F4'|'\u1401'..'\u166C'|'\u166F'..'\u1676'|'\u1681'..'\u169A'|'\u16A0'..'\u16EA'|'\u16EE'..'\u16F0'|'\u1700'..'\u170C'|'\u170E'..'\u1714'|'\u1720'..'\u1734'|'\u1740'..'\u1753'|'\u1760'..'\u176C'|'\u176E'..'\u1770'|'\u1772'..'\u1773'|'\u1780'..'\u17D3'|'\u17D7'|'\u17DB'..'\u17DD'|'\u17E0'..'\u17E9'|'\u180B'..'\u180D'|'\u1810'..'\u1819'|'\u1820'..'\u1877'|'\u1880'..'\u18A9'|'\u1900'..'\u191C'|'\u1920'..'\u192B'|'\u1930'..'\u193B'|'\u1946'..'\u196D'|'\u1970'..'\u1974'|'\u1D00'..'\u1D6B'|'\u1E00'..'\u1E9B'|'\u1EA0'..'\u1EF9'|'\u1F00'..'\u1F15'|'\u1F18'..'\u1F1D'|'\u1F20'..'\u1F45'|'\u1F48'..'\u1F4D'|'\u1F50'..'\u1F57'|'\u1F59'|'\u1F5B'|'\u1F5D'|'\u1F5F'..'\u1F7D'|'\u1F80'..'\u1FB4'|'\u1FB6'..'\u1FBC'|'\u1FBE'|'\u1FC2'..'\u1FC4'|'\u1FC6'..'\u1FCC'|'\u1FD0'..'\u1FD3'|'\u1FD6'..'\u1FDB'|'\u1FE0'..'\u1FEC'|'\u1FF2'..'\u1FF4'|'\u1FF6'..'\u1FFC'|'\u200C'..'\u200F'|'\u202A'..'\u202E'|'\u203F'..'\u2040'|'\u2054'|'\u2060'..'\u2063'|'\u206A'..'\u206F'|'\u2071'|'\u207F'|'\u20A0'..'\u20B1'|'\u20D0'..'\u20DC'|'\u20E1'|'\u20E5'..'\u20EA'|'\u2102'|'\u2107'|'\u210A'..'\u2113'|'\u2115'|'\u2119'..'\u211D'|'\u2124'|'\u2126'|'\u2128'|'\u212A'..'\u212D'|'\u212F'..'\u2131'|'\u2133'..'\u2139'|'\u213D'..'\u213F'|'\u2145'..'\u2149'|'\u2160'..'\u2183'|'\u3005'..'\u3007'|'\u3021'..'\u302F'|'\u3031'..'\u3035'|'\u3038'..'\u303C'|'\u3041'..'\u3096'|'\u3099'..'\u309A'|'\u309D'..'\u309F'|'\u30A1'..'\u30FF'|'\u3105'..'\u312C'|'\u3131'..'\u318E'|'\u31A0'..'\u31B7'|'\u31F0'..'\u31FF'|'\u3400'..'\u4DB5'|'\u4E00'..'\u9FA5'|'\uA000'..'\uA48C'|'\uAC00'..'\uD7A3'|'\uF900'..'\uFA2D'|'\uFA30'..'\uFA6A'|'\uFB00'..'\uFB06'|'\uFB13'..'\uFB17'|'\uFB1D'..'\uFB28'|'\uFB2A'..'\uFB36'|'\uFB38'..'\uFB3C'|'\uFB3E'|'\uFB40'..'\uFB41'|'\uFB43'..'\uFB44'|'\uFB46'..'\uFBB1'|'\uFBD3'..'\uFD3D'|'\uFD50'..'\uFD8F'|'\uFD92'..'\uFDC7'|'\uFDF0'..'\uFDFC'|'\uFE00'..'\uFE0F'|'\uFE20'..'\uFE23'|'\uFE33'..'\uFE34'|'\uFE4D'..'\uFE4F'|'\uFE69'|'\uFE70'..'\uFE74'|'\uFE76'..'\uFEFC'|'\uFEFF'|'\uFF04'|'\uFF10'..'\uFF19'|'\uFF21'..'\uFF3A'|'\uFF3F'|'\uFF41'..'\uFF5A'|'\uFF65'..'\uFFBE'|'\uFFC2'..'\uFFC7'|'\uFFCA'..'\uFFCF'|'\uFFD2'..'\uFFD7'|'\uFFDA'..'\uFFDC'|'\uFFE0'..'\uFFE1'|'\uFFE5'..'\uFFE6'|'\uFFF9'..'\uFFFB'|'\uD800'..'\uDBFF' '\uDC00'..'\uDFFF');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;


