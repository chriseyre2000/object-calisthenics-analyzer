package com.chairbender.object_calisthenics_analyzer.violation;

import com.chairbender.object_calisthenics_analyzer.util.MessageUtils;
import com.chairbender.object_calisthenics_analyzer.violation.model.RuleInfo;
import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;

import java.io.File;

/**
 * Represents a violation of having an obvious getter or setter
 *
 * Created by chairbender on 11/21/2015.
 */
public class NoGettersSettersViolation extends Violation {
    private static final RuleInfo ruleInfo = new RuleInfo("Tell, don't ask. Instead of asking for data from the object," +
            " tell it to do whatever you were going to do with that data.",
            "Rule 9 - No getters/setters/properties.");

    /**
     * @param violatingDeclaration the declaration violating the rule
     */
    public NoGettersSettersViolation(MethodDeclaration violatingDeclaration) {
        super(violatingDeclaration);
    }

    @Override
    public RuleInfo getRuleInfo() {
        return ruleInfo;
    }
}