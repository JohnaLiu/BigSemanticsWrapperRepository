package ecologylab.semantics.generated.library.dlese;

import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metadata.scalar.MetadataInteger;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.generated.library.dlese.Organization;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.serialization.simpl_inherit;

/**
*  Contributor.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 08/29/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class Contributor extends Metadata
{
	/** 
	 */ 
	@simpl_composite	@mm_name("organization")
	private Organization organization;

	/** 
	 */ 
	@simpl_scalar	
	private ecologylab.semantics.metadata.scalar.MetadataString role;

	/** 
	 */ 
	@simpl_scalar	
	private ecologylab.semantics.metadata.scalar.MetadataInteger date;

	public Contributor()
	{ }

	public Contributor(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public Organization getOrganization()
	{
		return organization;
	}

	public void setOrganization(Organization organization)
	{
		this.organization = organization;
	}

	public MetadataString	role()
	{
		MetadataString	result = this.role;
		if (result == null)
		{
			result = new MetadataString();
			this.role = result;
		}
		return result;
	}

	public String getRole()
	{
		return this.role == null ? null : role().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getRoleMetadata()
	{
		return role;
	}

	public void setRole(String role)
	{
		if (role != null)
			this.role().setValue(role);
	}

	public void setRoleMetadata(ecologylab.semantics.metadata.scalar.MetadataString role)
	{
		this.role = role;
	}

	public MetadataInteger	date()
	{
		MetadataInteger	result = this.date;
		if (result == null)
		{
			result = new MetadataInteger();
			this.date = result;
		}
		return result;
	}

	public Integer getDate()
	{
		return this.date == null ? 0 : date().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataInteger getDateMetadata()
	{
		return date;
	}

	public void setDate(Integer date)
	{
		if (date != 0)
			this.date().setValue(date);
	}

	public void setDateMetadata(ecologylab.semantics.metadata.scalar.MetadataInteger date)
	{
		this.date = date;
	}
}