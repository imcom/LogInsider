package imcom.forensics.extractors;

import android.net.Uri;
import imcom.forensics.FormatHelper;

public class CalendarExtractor extends GenericExtractor {
	
	public CalendarExtractor(String extractor_name) {
		super(extractor_name);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setContentUri(Uri uri) {
		// TODO Auto-generated method stub
		this.uri = uri;
	}

	@Override
	public void setProjection(String[] projection) {
		// TODO Auto-generated method stub
		this.projection = projection;
	}

	@Override
	public void setSelection(String selection) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSelectionArgs(String selection_args[]) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSortOrder(String sort_order) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getSelection() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getSelectionArgs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getSortOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getProjection() {
		// TODO Auto-generated method stub
		return this.projection;
	}

	@Override
	public Uri getContentUri() {
		// TODO Auto-generated method stub
		return this.uri;
	}

	@Override
	public String getExtractorName() {
		// TODO Auto-generated method stub
		return this.extractor_name;
	}

	@Override
	public void setFormat(FormatHelper helper) {
		// TODO Auto-generated method stub
		this.helper = helper;
	}

	@Override
	public String getFormatHelper() {
		// TODO Auto-generated method stub
		return this.helper.getFormatName();
	}

}
