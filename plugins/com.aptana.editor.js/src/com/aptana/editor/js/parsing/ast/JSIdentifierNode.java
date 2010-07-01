package com.aptana.editor.js.parsing.ast;

import beaver.Symbol;

import com.aptana.editor.js.contentassist.LocationType;

public class JSIdentifierNode extends JSPrimitiveNode
{
	/**
	 * JSIdentifierNode
	 * 
	 * @param identifier
	 */
	public JSIdentifierNode(Symbol identifier)
	{
		this((String) identifier.value);
	}

	/**
	 * JSIdentifierNode
	 * 
	 * @param text
	 */
	public JSIdentifierNode(String text)
	{
		super(JSNodeTypes.IDENTIFIER, text);
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

	/*
	 * (non-Javadoc)
	 * @see com.aptana.editor.js.parsing.ast.JSNode#getLocationType(int)
	 */
	@Override
	LocationType getLocationType(int offset)
	{
		LocationType result = LocationType.IN_GLOBAL;

		if (this.contains(offset))
		{
			result = LocationType.IN_VARIABLE_NAME;
		}

		return result;
	}
}
