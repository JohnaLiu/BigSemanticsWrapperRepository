package ecologylab.semantics.generated.library.nsf;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2013) Interface Ecology Lab.
 */

import ecologylab.semantics.generated.library.nsf.NsfProgramStaffList;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class NsfDivisionStaffList extends CompoundDocument
{
	@simpl_collection("program")
	@mm_name("programs")
	private List<NsfProgramStaffList> programs;

	public NsfDivisionStaffList()
	{ super(); }

	public NsfDivisionStaffList(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<NsfProgramStaffList> getPrograms()
	{
		return programs;
	}

  // lazy evaluation:
  public List<NsfProgramStaffList> programs()
  {
    if (programs == null)
      programs = new ArrayList<NsfProgramStaffList>();
    return programs;
  }

  // addTo:
  public void addToPrograms(NsfProgramStaffList element)
  {
    programs().add(element);
  }

  // size:
  public int programsSize()
  {
    return programs == null ? 0 : programs.size();
  }

	public void setPrograms(List<NsfProgramStaffList> programs)
	{
		this.programs = programs;
	}
}