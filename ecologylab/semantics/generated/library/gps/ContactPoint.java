package ecologylab.semantics.generated.library.gps;

import ecologylab.serialization.ElementState.xml_other_tags;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import java.util.List;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.ElementState.xml_tag;

/**
*  ContactPoint.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/21/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * Resembles a schema.org ContactPoint but is a mixin, not extending document.
 */ 
@simpl_inherit
public class ContactPoint extends Metadata
{
	/** 
	 */ 
	@simpl_scalar	private MetadataString telephone;

	/** 
	 */ 
	@simpl_scalar	private MetadataString faxNumber;

	/** 
	 */ 
	@simpl_scalar	private MetadataString email;

	public ContactPoint()
	{ }

	public ContactPoint(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	telephone()
	{
		MetadataString	result = this.telephone;
		if (result == null)
		{
			result = new MetadataString();
			this.telephone = result;
		}
		return result;
	}

	public String getTelephone()
	{
		return this.telephone().getValue();
	}

	public MetadataString getTelephoneMetadata()
	{
		return telephone;
	}

	public void setTelephone(String telephone)
	{
		this.telephone().setValue(telephone);
	}

	public void setTelephoneMetadata(MetadataString telephone)
	{
		this.telephone = telephone;
	}

	public MetadataString	faxNumber()
	{
		MetadataString	result = this.faxNumber;
		if (result == null)
		{
			result = new MetadataString();
			this.faxNumber = result;
		}
		return result;
	}

	public String getFaxNumber()
	{
		return this.faxNumber().getValue();
	}

	public MetadataString getFaxNumberMetadata()
	{
		return faxNumber;
	}

	public void setFaxNumber(String faxNumber)
	{
		this.faxNumber().setValue(faxNumber);
	}

	public void setFaxNumberMetadata(MetadataString faxNumber)
	{
		this.faxNumber = faxNumber;
	}

	public MetadataString	email()
	{
		MetadataString	result = this.email;
		if (result == null)
		{
			result = new MetadataString();
			this.email = result;
		}
		return result;
	}

	public String getEmail()
	{
		return this.email().getValue();
	}

	public MetadataString getEmailMetadata()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email().setValue(email);
	}

	public void setEmailMetadata(MetadataString email)
	{
		this.email = email;
	}
}