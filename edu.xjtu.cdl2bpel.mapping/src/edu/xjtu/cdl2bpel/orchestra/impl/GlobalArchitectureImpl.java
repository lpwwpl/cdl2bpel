/**
 * CDL2BPEL_XJTU
 *
 * $Id: GlobalArchitectureImpl.java,v 1.1 2011/02/21 06:24:06 administrator Exp $
 */
package edu.xjtu.cdl2bpel.orchestra.impl;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import edu.xjtu.cdl2bpel.cdl2bpel.util.WSBPELKeywords;
import edu.xjtu.cdl2bpel.orchestra.BPOrchestra;
import edu.xjtu.cdl2bpel.orchestra.GlobalArchitecture;
import edu.xjtu.cdl2bpel.orchestra.InformationType;
import edu.xjtu.cdl2bpel.orchestra.InterfaceOfGroup;
import edu.xjtu.cdl2bpel.orchestra.Namespace;
import edu.xjtu.cdl2bpel.orchestra.OrchestraPackage;
import edu.xjtu.cdl2bpel.orchestra2bpel.Orchestra2BPELContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Global Architecture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.GlobalArchitectureImpl#getStateless <em>Stateless</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.GlobalArchitectureImpl#getNamespaces <em>Namespaces</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.GlobalArchitectureImpl#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.GlobalArchitectureImpl#getInformationTypes <em>Information Types</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.GlobalArchitectureImpl#getBpOrchestras <em>Bp Orchestras</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GlobalArchitectureImpl extends BPElementImpl implements GlobalArchitecture {
	/**
	 * The default value of the '{@link #getStateless() <em>Stateless</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateless()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean STATELESS_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getStateless() <em>Stateless</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateless()
	 * @generated
	 * @ordered
	 */
	protected Boolean stateless = STATELESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNamespaces() <em>Namespaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Namespace> namespaces;

	/**
	 * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceOfGroup> interfaces;

	/**
	 * The cached value of the '{@link #getInformationTypes() <em>Information Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformationTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<InformationType> informationTypes;

	/**
	 * The cached value of the '{@link #getBpOrchestras() <em>Bp Orchestras</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBpOrchestras()
	 * @generated
	 * @ordered
	 */
	protected EList<BPOrchestra> bpOrchestras;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlobalArchitectureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrchestraPackage.Literals.GLOBAL_ARCHITECTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getStateless() {
		return stateless;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateless(Boolean newStateless) {
		Boolean oldStateless = stateless;
		stateless = newStateless;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrchestraPackage.GLOBAL_ARCHITECTURE__STATELESS, oldStateless, stateless));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Namespace> getNamespaces() {
		if (namespaces == null) {
			namespaces = new EObjectContainmentEList<Namespace>(Namespace.class, this, OrchestraPackage.GLOBAL_ARCHITECTURE__NAMESPACES);
		}
		return namespaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceOfGroup> getInterfaces() {
		if (interfaces == null) {
			interfaces = new EObjectContainmentEList<InterfaceOfGroup>(InterfaceOfGroup.class, this, OrchestraPackage.GLOBAL_ARCHITECTURE__INTERFACES);
		}
		return interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InformationType> getInformationTypes() {
		if (informationTypes == null) {
			informationTypes = new EObjectContainmentEList<InformationType>(InformationType.class, this, OrchestraPackage.GLOBAL_ARCHITECTURE__INFORMATION_TYPES);
		}
		return informationTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BPOrchestra> getBpOrchestras() {
		if (bpOrchestras == null) {
			bpOrchestras = new EObjectContainmentEList<BPOrchestra>(BPOrchestra.class, this, OrchestraPackage.GLOBAL_ARCHITECTURE__BP_ORCHESTRAS);
		}
		return bpOrchestras;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrchestraPackage.GLOBAL_ARCHITECTURE__NAMESPACES:
				return ((InternalEList<?>)getNamespaces()).basicRemove(otherEnd, msgs);
			case OrchestraPackage.GLOBAL_ARCHITECTURE__INTERFACES:
				return ((InternalEList<?>)getInterfaces()).basicRemove(otherEnd, msgs);
			case OrchestraPackage.GLOBAL_ARCHITECTURE__INFORMATION_TYPES:
				return ((InternalEList<?>)getInformationTypes()).basicRemove(otherEnd, msgs);
			case OrchestraPackage.GLOBAL_ARCHITECTURE__BP_ORCHESTRAS:
				return ((InternalEList<?>)getBpOrchestras()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrchestraPackage.GLOBAL_ARCHITECTURE__STATELESS:
				return getStateless();
			case OrchestraPackage.GLOBAL_ARCHITECTURE__NAMESPACES:
				return getNamespaces();
			case OrchestraPackage.GLOBAL_ARCHITECTURE__INTERFACES:
				return getInterfaces();
			case OrchestraPackage.GLOBAL_ARCHITECTURE__INFORMATION_TYPES:
				return getInformationTypes();
			case OrchestraPackage.GLOBAL_ARCHITECTURE__BP_ORCHESTRAS:
				return getBpOrchestras();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OrchestraPackage.GLOBAL_ARCHITECTURE__STATELESS:
				setStateless((Boolean)newValue);
				return;
			case OrchestraPackage.GLOBAL_ARCHITECTURE__NAMESPACES:
				getNamespaces().clear();
				getNamespaces().addAll((Collection<? extends Namespace>)newValue);
				return;
			case OrchestraPackage.GLOBAL_ARCHITECTURE__INTERFACES:
				getInterfaces().clear();
				getInterfaces().addAll((Collection<? extends InterfaceOfGroup>)newValue);
				return;
			case OrchestraPackage.GLOBAL_ARCHITECTURE__INFORMATION_TYPES:
				getInformationTypes().clear();
				getInformationTypes().addAll((Collection<? extends InformationType>)newValue);
				return;
			case OrchestraPackage.GLOBAL_ARCHITECTURE__BP_ORCHESTRAS:
				getBpOrchestras().clear();
				getBpOrchestras().addAll((Collection<? extends BPOrchestra>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OrchestraPackage.GLOBAL_ARCHITECTURE__STATELESS:
				setStateless(STATELESS_EDEFAULT);
				return;
			case OrchestraPackage.GLOBAL_ARCHITECTURE__NAMESPACES:
				getNamespaces().clear();
				return;
			case OrchestraPackage.GLOBAL_ARCHITECTURE__INTERFACES:
				getInterfaces().clear();
				return;
			case OrchestraPackage.GLOBAL_ARCHITECTURE__INFORMATION_TYPES:
				getInformationTypes().clear();
				return;
			case OrchestraPackage.GLOBAL_ARCHITECTURE__BP_ORCHESTRAS:
				getBpOrchestras().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OrchestraPackage.GLOBAL_ARCHITECTURE__STATELESS:
				return STATELESS_EDEFAULT == null ? stateless != null : !STATELESS_EDEFAULT.equals(stateless);
			case OrchestraPackage.GLOBAL_ARCHITECTURE__NAMESPACES:
				return namespaces != null && !namespaces.isEmpty();
			case OrchestraPackage.GLOBAL_ARCHITECTURE__INTERFACES:
				return interfaces != null && !interfaces.isEmpty();
			case OrchestraPackage.GLOBAL_ARCHITECTURE__INFORMATION_TYPES:
				return informationTypes != null && !informationTypes.isEmpty();
			case OrchestraPackage.GLOBAL_ARCHITECTURE__BP_ORCHESTRAS:
				return bpOrchestras != null && !bpOrchestras.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (stateless: ");
		result.append(stateless);
		result.append(')');
		return result.toString();
	}

	public BPOrchestra getBPOrchestra(String name) {
		for(Iterator it = getBpOrchestras().iterator();it.hasNext();){
			BPOrchestra orche=(BPOrchestra)it.next();
			if(orche.getName().equals(name)) {
				return orche;
			}
		}
		return null;
	}
	
	public InformationType getInformationType(String name) {
		InformationType ret=null;
		
		Iterator iter=getInformationTypes().iterator();
		while (ret == null && iter.hasNext()) {
			InformationType it=(InformationType)iter.next();
			
			if (it.getName() != null &&
					it.getName().equals(name)) {
				ret = it;
			}
		}

		return(ret);
	}
	
	public String getFullyQualifiedName() {
		String ret="";
		
		if (getParent() instanceof BPElementImpl) {
			GlobalArchitectureImpl ga=
				((BPElementImpl)getParent()).
					getGlobalArchitectureImpl();
			
			if (ga != null) {
				ret = ga.getFullyQualifiedName()+".";
			}
		}
		
		ret += getName();
		
		return(ret);
	}
	
	public String getNameSpacePrefixForURI(String uri) {
    	String ret=null;
    	
    	Iterator iter=getNamespaces().iterator();
    	while (ret == null && iter.hasNext()) {
    		Namespace ns=(Namespace)iter.next();
    		
    		if (ns.getUri().equals(uri)) {
    			ret = ns.getPrefix();
    		}
    	}

    	return(ret);
    }
	
	public String getNameSpaceURIForPrefix(String prefix) {
    	String ret=null;
    	
    	Iterator iter=getNamespaces().iterator();
    	while (ret == null && iter.hasNext()) {
    		Namespace ns=(Namespace)iter.next();
    		
    		if (ns.getPrefix().equals(prefix)) {
    			ret = ns.getUri();
    		}
    	}
    	
    	return(ret);
    }
	
	public InterfaceOfGroup getInterfaceOfGroup(String name) {
		InterfaceOfGroup ret=null;
		
		Iterator iter = getInterfaces().iterator();
		while (ret == null && iter.hasNext()) {
			InterfaceOfGroup st=(InterfaceOfGroup)iter.next();
			if (st.getFullyQualifiedName() != null &&
					st.getFullyQualifiedName().equals(name)) {
				
				ret = st;
			}
		}
		
		return(ret);
	}
	
	
	public String getTargetNamespace() {
		return targetNamespace;
	}

	public void setTargetNamespace(String targetNamespace) {
		this.targetNamespace = targetNamespace;
	}

	protected String targetNamespace;

	public void transtorm(Orchestra2BPELContext context) {

		super.transtorm(context);
		//以下处理scopePlaceHoder
		NodeList scopePlaceholderList=context.getDocument().getElementsByTagName("scopePlaceholder");
		this.dealScopePlaceHolder(scopePlaceholderList, context);
	}

	private void dealScopePlaceHolder(NodeList scopePlaceholderList,Orchestra2BPELContext context){
		for(int i=0;i<scopePlaceholderList.getLength();i++){
			Element scopePlaceholder = (Element) scopePlaceholderList.item(i);
			String nameOfScope=scopePlaceholder.getAttribute("name");
			if(scopePlaceholder!=null){
				Element scope=context.getScopeRegistry().getScope(nameOfScope);
				if(scope!=null){
					
				//将scope里面的流程放到	scopePlaceholder  的起始sequence和结束sequence之间
					
					NodeList sequenceList=scopePlaceholder.getElementsByTagName("sequence");
					if(sequenceList.getLength()==2){//scopePlaceholder中只有起始和终止sequence，所以是2
//						//找出scope里的第一个活动
						Node firstActivity=null;
						NodeList childrenOfScope=scope.getChildNodes();
						for(int j=0;j<childrenOfScope.getLength();j++){
							String nodeName=childrenOfScope.item(j).getNodeName();
							if(WSBPELKeywords.isActivity(nodeName)){
								firstActivity=childrenOfScope.item(j);
							}
						}
						if(firstActivity!=null){
							Element startSequence=(Element) sequenceList.item(0);
							Element endSequence=(Element) sequenceList.item(1);
							scope.insertBefore(startSequence, firstActivity);
							scope.appendChild(endSequence);
						}else{
							System.out.println("出错！！！firstActivity是null。<GlobalArchitectureImpl>");
						}
					}else{
						System.out.println("出错！！！scopePlaceholder中sequence的数目不是2。 <GlobalArchitectureImpl>");
					}
					Node parent=scopePlaceholder.getParentNode();
					parent.replaceChild(scope, scopePlaceholder);
				}else{
					System.out.println("出错！！！找不到与scopePlaceholder对应的scope。<GlobalArchitectureImpl> ");
				}
			}
		}
	}

} //GlobalArchitectureImpl
