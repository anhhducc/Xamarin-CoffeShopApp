package crc643f46942d9dd1fff9;


public class PageExtensions_EmbeddedFragment
	extends android.app.Fragment
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreateView:(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;:GetOnCreateView_Landroid_view_LayoutInflater_Landroid_view_ViewGroup_Landroid_os_Bundle_Handler\n" +
			"";
		mono.android.Runtime.register ("Xamarin.Forms.Platform.Android.PageExtensions+EmbeddedFragment, Xamarin.Forms.Platform.Android", PageExtensions_EmbeddedFragment.class, __md_methods);
	}


	public PageExtensions_EmbeddedFragment ()
	{
		super ();
		if (getClass () == PageExtensions_EmbeddedFragment.class) {
			mono.android.TypeManager.Activate ("Xamarin.Forms.Platform.Android.PageExtensions+EmbeddedFragment, Xamarin.Forms.Platform.Android", "", this, new java.lang.Object[] {  });
		}
	}


	public android.view.View onCreateView (android.view.LayoutInflater p0, android.view.ViewGroup p1, android.os.Bundle p2)
	{
		return n_onCreateView (p0, p1, p2);
	}

	private native android.view.View n_onCreateView (android.view.LayoutInflater p0, android.view.ViewGroup p1, android.os.Bundle p2);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
