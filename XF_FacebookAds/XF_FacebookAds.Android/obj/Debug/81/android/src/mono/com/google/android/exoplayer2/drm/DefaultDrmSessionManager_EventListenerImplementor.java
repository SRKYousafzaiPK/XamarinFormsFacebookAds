package mono.com.google.android.exoplayer2.drm;


public class DefaultDrmSessionManager_EventListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.exoplayer2.drm.DefaultDrmSessionManager.EventListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onDrmKeysLoaded:()V:GetOnDrmKeysLoadedHandler:Com.Google.Android.Exoplayer2.Drm.DefaultDrmSessionManager/IEventListenerInvoker, ExoPlayer.Core\n" +
			"n_onDrmKeysRemoved:()V:GetOnDrmKeysRemovedHandler:Com.Google.Android.Exoplayer2.Drm.DefaultDrmSessionManager/IEventListenerInvoker, ExoPlayer.Core\n" +
			"n_onDrmKeysRestored:()V:GetOnDrmKeysRestoredHandler:Com.Google.Android.Exoplayer2.Drm.DefaultDrmSessionManager/IEventListenerInvoker, ExoPlayer.Core\n" +
			"n_onDrmSessionManagerError:(Ljava/lang/Exception;)V:GetOnDrmSessionManagerError_Ljava_lang_Exception_Handler:Com.Google.Android.Exoplayer2.Drm.DefaultDrmSessionManager/IEventListenerInvoker, ExoPlayer.Core\n" +
			"";
		mono.android.Runtime.register ("Com.Google.Android.Exoplayer2.Drm.DefaultDrmSessionManager+IEventListenerImplementor, ExoPlayer.Core", DefaultDrmSessionManager_EventListenerImplementor.class, __md_methods);
	}


	public DefaultDrmSessionManager_EventListenerImplementor ()
	{
		super ();
		if (getClass () == DefaultDrmSessionManager_EventListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Google.Android.Exoplayer2.Drm.DefaultDrmSessionManager+IEventListenerImplementor, ExoPlayer.Core", "", this, new java.lang.Object[] {  });
	}


	public void onDrmKeysLoaded ()
	{
		n_onDrmKeysLoaded ();
	}

	private native void n_onDrmKeysLoaded ();


	public void onDrmKeysRemoved ()
	{
		n_onDrmKeysRemoved ();
	}

	private native void n_onDrmKeysRemoved ();


	public void onDrmKeysRestored ()
	{
		n_onDrmKeysRestored ();
	}

	private native void n_onDrmKeysRestored ();


	public void onDrmSessionManagerError (java.lang.Exception p0)
	{
		n_onDrmSessionManagerError (p0);
	}

	private native void n_onDrmSessionManagerError (java.lang.Exception p0);

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
