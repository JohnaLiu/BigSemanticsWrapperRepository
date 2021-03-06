package ecologylab.bigsemantics.generated.library.dlese;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.metadata.Metadata;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import ecologylab.serialization.annotations.simpl_tag;
import java.lang.String;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class Audience extends Metadata
{
	@simpl_scalar
	@simpl_tag("gradeRange")
	private MetadataString gradeRange;

	public Audience()
	{ super(); }

	public Audience(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	gradeRange()
	{
		MetadataString	result = this.gradeRange;
		if (result == null)
		{
			result = new MetadataString();
			this.gradeRange = result;
		}
		return result;
	}

	public String getGradeRange()
	{
		return this.gradeRange == null ? null : gradeRange().getValue();
	}

	public MetadataString getGradeRangeMetadata()
	{
		return gradeRange;
	}

	public void setGradeRange(String gradeRange)
	{
		if (gradeRange != null)
			this.gradeRange().setValue(gradeRange);
	}

	public void setGradeRangeMetadata(MetadataString gradeRange)
	{
		this.gradeRange = gradeRange;
	}
}
