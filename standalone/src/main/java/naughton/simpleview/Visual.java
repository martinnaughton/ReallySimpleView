package naughton.simpleview;

import hudson.Extension;
import hudson.model.AllView;
import hudson.model.ViewDescriptor;

import org.kohsuke.stapler.DataBoundConstructor;


//change the extension between ListView, AllView and View.See how the user interface changes.
public class Visual extends AllView{
	
	@DataBoundConstructor
	public Visual(String name) {
		super(name);
	}
	
	public String getType(){
    	return "lager";
    }
	
	@Extension
    public static final class DescriptorImpl extends ViewDescriptor {
            public DescriptorImpl() {
                    super();
            }

            @Override
            public String getDisplayName() {
                    return "Visual";
            }
    }

}
