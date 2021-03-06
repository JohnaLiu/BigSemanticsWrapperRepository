package ecologylab.bigsemantics.generated.library.disaster;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.gis.GisLocation;
import ecologylab.bigsemantics.metadata.builtins.CompoundDocument;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metadata.scalar.MetadataDate;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.util.Date;
import java.util.List;
import java.util.Map;

/** 
 *Generalized Event Object
 */ 
@simpl_inherit
public class Event extends CompoundDocument
{
	@simpl_scalar
	private MetadataDate startTime;

	@simpl_scalar
	private MetadataDate endTime;

	@simpl_composite
	@mm_name("gis_location")
	private GisLocation gisLocation;

	public Event()
	{ super(); }

	public Event(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataDate	startTime()
	{
		MetadataDate	result = this.startTime;
		if (result == null)
		{
			result = new MetadataDate();
			this.startTime = result;
		}
		return result;
	}

	public Date getStartTime()
	{
		return this.startTime == null ? null : startTime().getValue();
	}

	public MetadataDate getStartTimeMetadata()
	{
		return startTime;
	}

	public void setStartTime(Date startTime)
	{
		if (startTime != null)
			this.startTime().setValue(startTime);
	}

	public void setStartTimeMetadata(MetadataDate startTime)
	{
		this.startTime = startTime;
	}

	public MetadataDate	endTime()
	{
		MetadataDate	result = this.endTime;
		if (result == null)
		{
			result = new MetadataDate();
			this.endTime = result;
		}
		return result;
	}

	public Date getEndTime()
	{
		return this.endTime == null ? null : endTime().getValue();
	}

	public MetadataDate getEndTimeMetadata()
	{
		return endTime;
	}

	public void setEndTime(Date endTime)
	{
		if (endTime != null)
			this.endTime().setValue(endTime);
	}

	public void setEndTimeMetadata(MetadataDate endTime)
	{
		this.endTime = endTime;
	}

	public GisLocation getGisLocation()
	{
		return gisLocation;
	}

	public void setGisLocation(GisLocation gisLocation)
	{
		this.gisLocation = gisLocation;
	}
}
