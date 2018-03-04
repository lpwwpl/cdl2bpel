package edu.xjtu.cdl2bpel.cdl2orchestra;

import java.lang.reflect.Constructor;
import java.util.Hashtable;

import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.cdl.impl.AssignImpl;
import edu.xjtu.cdl2bpel.cdl.impl.CaseConditionalOfSwitchImpl;
import edu.xjtu.cdl2bpel.cdl.impl.ChoiceImpl;
import edu.xjtu.cdl2bpel.cdl.impl.ChoreographyImpl;
import edu.xjtu.cdl2bpel.cdl.impl.ExceptionBlockImpl;
import edu.xjtu.cdl2bpel.cdl.impl.ExceptionWorkUnitImpl;
import edu.xjtu.cdl2bpel.cdl.impl.FinalizeImpl;
import edu.xjtu.cdl2bpel.cdl.impl.FinalizerBlockImpl;
import edu.xjtu.cdl2bpel.cdl.impl.InteractionImpl;
import edu.xjtu.cdl2bpel.cdl.impl.NoActionImpl;
import edu.xjtu.cdl2bpel.cdl.impl.PackageImpl;
import edu.xjtu.cdl2bpel.cdl.impl.ParallelImpl;
import edu.xjtu.cdl2bpel.cdl.impl.PerformImpl;
import edu.xjtu.cdl2bpel.cdl.impl.ScopeWithNoAttrOfWorkUnitImpl;
import edu.xjtu.cdl2bpel.cdl.impl.SequenceImpl;
import edu.xjtu.cdl2bpel.cdl.impl.SilentActionImpl;
import edu.xjtu.cdl2bpel.cdl.impl.WhenWithBlockOfWorkUnitImpl;
import edu.xjtu.cdl2bpel.cdl.impl.WhileWithRepeateOfWorkUnitImpl;
import edu.xjtu.cdl2bpel.orchestra.BPOrchestra;

public class CDL2OrchestraProjectorProxy {

	private static Hashtable proxyProjectors = new Hashtable();

	static {
		CDL2OrchestraProjectorProxy.registerProjectorProxy(PackageImpl.class
				.getName(), PackageRoleRelevanceProjector.class);
		CDL2OrchestraProjectorProxy.registerProjectorProxy(
				ChoreographyImpl.class.getName(),
				ChoreographyRoleRelevanceProjector.class);
		CDL2OrchestraProjectorProxy.registerProjectorProxy(AssignImpl.class
				.getName(), AssignRoleRelevanceProjector.class);
		CDL2OrchestraProjectorProxy.registerProjectorProxy(
				CaseConditionalOfSwitchImpl.class.getName(),
				CaseConditionalOfSwitchRoleRelevanceProjector.class);
		CDL2OrchestraProjectorProxy.registerProjectorProxy(ChoiceImpl.class
				.getName(), ChoiceRoleRelevanceProjector.class);
		CDL2OrchestraProjectorProxy.registerProjectorProxy(
				ExceptionBlockImpl.class.getName(),
				ExceptionBlockRoleRelevanceProjector.class);
		CDL2OrchestraProjectorProxy.registerProjectorProxy(
				ExceptionWorkUnitImpl.class.getName(),
				ExceptionWorkUnitRoleRelevanceProjector.class);
		CDL2OrchestraProjectorProxy.registerProjectorProxy(FinalizeImpl.class
				.getName(), FinalizeRoleRelevanceProjector.class);
		CDL2OrchestraProjectorProxy.registerProjectorProxy(
				FinalizerBlockImpl.class.getName(),
				FinalizerBlockRoleRelevanceProjector.class);
		CDL2OrchestraProjectorProxy.registerProjectorProxy(
				InteractionImpl.class.getName(),
				InteractionRoleRelevanceProjector.class);
		CDL2OrchestraProjectorProxy.registerProjectorProxy(NoActionImpl.class
				.getName(), NoActionRoleRelevanceProjector.class);
		CDL2OrchestraProjectorProxy.registerProjectorProxy(ParallelImpl.class
				.getName(), ParallelRoleRelevanceProjector.class);
		CDL2OrchestraProjectorProxy.registerProjectorProxy(PerformImpl.class
				.getName(), PerformRoleRelevanceProjector.class);
		CDL2OrchestraProjectorProxy.registerProjectorProxy(
				ScopeWithNoAttrOfWorkUnitImpl.class.getName(),
				ScopeWithNoAttrOfWorkUnitRoleRelevanceProjector.class);
		CDL2OrchestraProjectorProxy.registerProjectorProxy(SequenceImpl.class
				.getName(), SequenceRoleRelevanceProjector.class);
		CDL2OrchestraProjectorProxy.registerProjectorProxy(
				SilentActionImpl.class.getName(),
				SilentActionRoleRelevanceProjector.class);
		CDL2OrchestraProjectorProxy.registerProjectorProxy(
				WhenWithBlockOfWorkUnitImpl.class.getName(),
				WhenWithBlockOfWorkUnitRoleRelevanceProjector.class);
		CDL2OrchestraProjectorProxy.registerProjectorProxy(
				WhileWithRepeateOfWorkUnitImpl.class.getName(),
				WhileWithRepeateOfWorkUnitRoleRelevanceProjector.class);
		CDL2OrchestraProjectorProxy.registerProjectorProxy(
				ScopeWithNoAttrOfWorkUnitImpl.class.getName(),
				ScopeWithNoAttrOfWorkUnitRoleRelevanceProjector.class);
	}

	public static void registerProjectorProxy(String type, Class proxyClass) {
		proxyProjectors.put(type, proxyClass);
	}

	protected static Class getProxyProjectorClass(String cdlElement) {
		return ((Class) proxyProjectors.get(cdlElement));
	}

	/**
	 * Get the specific AbstractCDL2OrchestraProjector instance and initial
	 * instance by Constructor method according to CDLElement.
	 * 
	 * @param context
	 *            the context when projecting CDL2Orchestra mapping.
	 * @param cdlElement the Current CDLElement 
	 * @return the specific AbstractCDL2OrchestraProjector instance and initial
	 *         instance by Constructor method according to CDLElement
	 */
	public static AbstractCDL2OrchestraProjector getCDL2OrchestraProjector(
			CDL2OrchestraRoleRelevanceContext context, CDLElement cdlElement) {

		AbstractCDL2OrchestraProjector obj = null;
		String type = cdlElement.getClass().getName();
		Class proxyClass = getProxyProjectorClass(type);
		if (proxyClass != null) {
			try {
				if (proxyClass == ChoreographyRoleRelevanceProjector.class) {
					Class[] argTypes = new Class[] { CDLElement.class,
							CDL2OrchestraRoleRelevanceContext.class,
							BPOrchestra.class };
					// argTypes
					Constructor con = proxyClass.getConstructor(argTypes);
					Object[] params = new Object[] { cdlElement, context,
							context.getCurrentBPOrchestra() };

					obj = (AbstractCDL2OrchestraProjector) con
							.newInstance(params);
				} else {
					Class[] argTypes = new Class[] { CDLElement.class,
							CDL2OrchestraRoleRelevanceContext.class };
					// argTypes
					Constructor con = proxyClass.getConstructor(argTypes);
					Object[] params = new Object[] { cdlElement, context };

					obj = (AbstractCDL2OrchestraProjector) con
							.newInstance(params);
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		return obj;
	}
}
