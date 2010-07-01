package com.aptana.editor.js.parsing.ast;

import beaver.Symbol;

public class JSFalseNode extends JSPrimitiveNode
{
	/**
	 * JSFalseNode
	 * 
	 * @param identifier
	 */
	public JSFalseNode(Symbol identifier)
	{
		this();
	}

	/**
	 * JSFalseNode
	 * 
	 * @param text
	 * @param start
	 * @param end
	 */
	public JSFalseNode()
	{
		super(JSNodeTypes.FALSE, "false");
	}

	/*
	 * (non-Javadoc)
	 * @see com.aptana.editor.js.parsing.ast.JSNode#accept(com.aptana.editor.js.parsing.ast.JSTreeWalker)
	 */
	@Override
	public void accept(JSTreeWalker walker)
	{
		walker.visit(this);
	}
}
