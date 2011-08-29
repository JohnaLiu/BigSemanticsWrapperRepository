package ecologylab.semantics.generated.library.dlese;

import ecologylab.semantics.metadata.scalar.MetadataInteger;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.serialization.simpl_inherit;

/**
*  ResultInfo.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 08/29/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class ResultInfo extends Metadata
{
	/** 
	 */ 
	@simpl_scalar	
	private ecologylab.semantics.metadata.scalar.MetadataInteger offset;

	/** 
	 */ 
	@simpl_scalar	@xml_tag("numReturned")	
	private ecologylab.semantics.metadata.scalar.MetadataInteger returned;

	/** 
	 */ 
	@simpl_scalar	@xml_tag("totalNumRecordsInLibrary")	
	private ecologylab.semantics.metadata.scalar.MetadataInteger totalRecords;

	/** 
	 */ 
	@simpl_scalar	@xml_tag("totalNumResults")	
	private ecologylab.semantics.metadata.scalar.MetadataInteger totalResults;

	public ResultInfo()
	{ }

	public ResultInfo(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataInteger	offset()
	{
		MetadataInteger	result = this.offset;
		if (result == null)
		{
			result = new MetadataInteger();
			this.offset = result;
		}
		return result;
	}

	public Integer getOffset()
	{
		return this.offset == null ? 0 : offset().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataInteger getOffsetMetadata()
	{
		return offset;
	}

	public void setOffset(Integer offset)
	{
		if (offset != 0)
			this.offset().setValue(offset);
	}

	public void setOffsetMetadata(ecologylab.semantics.metadata.scalar.MetadataInteger offset)
	{
		this.offset = offset;
	}

	public MetadataInteger	returned()
	{
		MetadataInteger	result = this.returned;
		if (result == null)
		{
			result = new MetadataInteger();
			this.returned = result;
		}
		return result;
	}

	public Integer getReturned()
	{
		return this.returned == null ? 0 : returned().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataInteger getReturnedMetadata()
	{
		return returned;
	}

	public void setReturned(Integer returned)
	{
		if (returned != 0)
			this.returned().setValue(returned);
	}

	public void setReturnedMetadata(ecologylab.semantics.metadata.scalar.MetadataInteger returned)
	{
		this.returned = returned;
	}

	public MetadataInteger	totalRecords()
	{
		MetadataInteger	result = this.totalRecords;
		if (result == null)
		{
			result = new MetadataInteger();
			this.totalRecords = result;
		}
		return result;
	}

	public Integer getTotalRecords()
	{
		return this.totalRecords == null ? 0 : totalRecords().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataInteger getTotalRecordsMetadata()
	{
		return totalRecords;
	}

	public void setTotalRecords(Integer totalRecords)
	{
		if (totalRecords != 0)
			this.totalRecords().setValue(totalRecords);
	}

	public void setTotalRecordsMetadata(ecologylab.semantics.metadata.scalar.MetadataInteger totalRecords)
	{
		this.totalRecords = totalRecords;
	}

	public MetadataInteger	totalResults()
	{
		MetadataInteger	result = this.totalResults;
		if (result == null)
		{
			result = new MetadataInteger();
			this.totalResults = result;
		}
		return result;
	}

	public Integer getTotalResults()
	{
		return this.totalResults == null ? 0 : totalResults().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataInteger getTotalResultsMetadata()
	{
		return totalResults;
	}

	public void setTotalResults(Integer totalResults)
	{
		if (totalResults != 0)
			this.totalResults().setValue(totalResults);
	}

	public void setTotalResultsMetadata(ecologylab.semantics.metadata.scalar.MetadataInteger totalResults)
	{
		this.totalResults = totalResults;
	}
}