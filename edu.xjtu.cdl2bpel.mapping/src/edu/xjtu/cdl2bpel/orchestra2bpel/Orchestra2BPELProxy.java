package edu.xjtu.cdl2bpel.orchestra2bpel;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Hashtable;

import edu.xjtu.cdl2bpel.orchestra.impl.AssignImpl;
import edu.xjtu.cdl2bpel.orchestra.impl.BPOrchestraImpl;
import edu.xjtu.cdl2bpel.orchestra.impl.ChoiceImpl;
import edu.xjtu.cdl2bpel.orchestra.impl.CompensateHandlerImpl;
import edu.xjtu.cdl2bpel.orchestra.impl.ConditionalImpl;
import edu.xjtu.cdl2bpel.orchestra.impl.FaultHandlerImpl;
import edu.xjtu.cdl2bpel.orchestra.impl.GlobalArchitectureImpl;
import edu.xjtu.cdl2bpel.orchestra.impl.NoActionImpl;
import edu.xjtu.cdl2bpel.orchestra.impl.ParallelImpl;
import edu.xjtu.cdl2bpel.orchestra.impl.PerformImpl;
import edu.xjtu.cdl2bpel.orchestra.impl.ReceiveEndImpl;
import edu.xjtu.cdl2bpel.orchestra.impl.ScopeWithNoAttrImpl;
import edu.xjtu.cdl2bpel.orchestra.impl.SendEndImpl;
import edu.xjtu.cdl2bpel.orchestra.impl.CaseExceptionImpl;
import edu.xjtu.cdl2bpel.orchestra.impl.SequenceImpl;
import edu.xjtu.cdl2bpel.orchestra.impl.WhenImpl;
import edu.xjtu.cdl2bpel.orchestra.impl.WhileImpl;

public class Orchestra2BPELProxy {

	private static Hashtable proxyProjectors = new Hashtable();
	static{
		Orchestra2BPELProxy.registerProjectorProxy(GlobalArchitectureImpl.class.getName(), GlobalArchitectureProjector.class);
		Orchestra2BPELProxy.registerProjectorProxy(BPOrchestraImpl.class.getName(), BPOrchestraProjector.class);
		Orchestra2BPELProxy.registerProjectorProxy(ChoiceImpl.class.getName(), ChoiceProjector.class);
		Orchestra2BPELProxy.registerProjectorProxy(SendEndImpl.class.getName(), SendEndProjector.class);
		Orchestra2BPELProxy.registerProjectorProxy(ReceiveEndImpl.class.getName(), ReceiveEndProjector.class);
		Orchestra2BPELProxy.registerProjectorProxy(ConditionalImpl.class.getName(), ConditionalProjector.class);
		Orchestra2BPELProxy.registerProjectorProxy(FaultHandlerImpl.class.getName(), FaultHandlerProjector.class);
		Orchestra2BPELProxy.registerProjectorProxy(CaseExceptionImpl.class.getName(), CaseExceptionProjector.class);
		Orchestra2BPELProxy.registerProjectorProxy(SequenceImpl.class.getName(), SequenceProjector.class);
		Orchestra2BPELProxy.registerProjectorProxy(AssignImpl.class.getName(), AssignProjector.class);
		Orchestra2BPELProxy.registerProjectorProxy(ParallelImpl.class.getName(), ParallelProjector.class);
		Orchestra2BPELProxy.registerProjectorProxy(PerformImpl.class.getName(), PerformProjector.class);
		Orchestra2BPELProxy.registerProjectorProxy(WhileImpl.class.getName(), WhileProjector.class);
		Orchestra2BPELProxy.registerProjectorProxy(WhenImpl.class.getName(), WhenProjector.class);
		Orchestra2BPELProxy.registerProjectorProxy(CompensateHandlerImpl.class.getName(), CompensateHandlerProjector.class);
		Orchestra2BPELProxy.registerProjectorProxy(ScopeWithNoAttrImpl.class.getName(), ScopeWithNoAttrProjector.class);
		Orchestra2BPELProxy.registerProjectorProxy(NoActionImpl.class.getName(), NoActionProjector.class);
	}
	
	public static void registerProjectorProxy(String orchestraClassName, Class projector) {
		proxyProjectors.put(orchestraClassName, projector);
	}
	
	public static Class getProjectorClassByOrchestraName(String orchestraName) {
		return ((Class) proxyProjectors.get(orchestraName));
	}
	@SuppressWarnings("unchecked")
	public static Orchestra2BPELProjector getProjectorByOrchestraName(String orchestraName) {
		Orchestra2BPELProjector projector=null;
		Class proxyClass=(Class) proxyProjectors.get(orchestraName);
		if(proxyClass!=null){
			try {
				Constructor constructor=proxyClass.getConstructor(null);
				projector=(Orchestra2BPELProjector) constructor.newInstance(null);
			} catch (SecurityException e) {
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
		}
		
		return projector;
	}
}
