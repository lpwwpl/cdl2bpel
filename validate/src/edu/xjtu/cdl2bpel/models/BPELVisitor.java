/***********************************************************
 *                    SOA Framework                        *        
 *               Author : Dang Trung Anh                   *
 *             Email: dangtrunganh@gmail.com		       *
 *                Copyright (c) 2008-2009 			       *
 *          by Hanoi University of Technology              *
 *         Department of Software Engineering              *
 *           Faculty of Information Technology             *
 *                                                         *
 **********************************************************/
package edu.xjtu.cdl2bpel.models;

import edu.xjtu.cdl2bpel.bpel.BPELAssign;
import edu.xjtu.cdl2bpel.bpel.BPELEmpty;
import edu.xjtu.cdl2bpel.bpel.BPELFlow;
import edu.xjtu.cdl2bpel.bpel.BPELInvoke;
import edu.xjtu.cdl2bpel.bpel.BPELPick;
import edu.xjtu.cdl2bpel.bpel.BPELProcess;
import edu.xjtu.cdl2bpel.bpel.BPELReceive;
import edu.xjtu.cdl2bpel.bpel.BPELReply;
import edu.xjtu.cdl2bpel.bpel.BPELScope;
import edu.xjtu.cdl2bpel.bpel.BPELSequence;
import edu.xjtu.cdl2bpel.bpel.BPELSwitch;
import edu.xjtu.cdl2bpel.bpel.BPELWait;
import edu.xjtu.cdl2bpel.bpel.BPELWhile;


/**
 * <p>
 * Title: BPELVisitor
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Copyright: Copyright (c) 2008 - 2009
 * </p>
 * <p>
 * Company:
 * </p>
 * 
 * @author Dang Trung Anh
 * @version 1.4
 */
public abstract class BPELVisitor {
	public BPELVisitor() {
	}

	public void visit(Object o) {
		if (o instanceof BPELProcess)
			visitProcess((BPELProcess) o);
		else if (o instanceof BPELAssign)
			visitAssign((BPELAssign) o);
		else if (o instanceof BPELEmpty)
			visitEmpty((BPELEmpty) o);
		else if (o instanceof BPELFlow)
			visitFlow((BPELFlow) o);
		else if (o instanceof BPELInvoke)
			visitInvoke((BPELInvoke) o);
		else if (o instanceof BPELPick)
			visitPick((BPELPick) o);
		else if (o instanceof BPELReceive)
			visitReceive((BPELReceive) o);
		else if (o instanceof BPELReply)
			visitReply((BPELReply) o);
		else if (o instanceof BPELScope)
			visitScope((BPELScope) o);
		else if (o instanceof BPELSequence)
			visitSequence((BPELSequence) o);
		else if (o instanceof BPELSwitch)
			visitSwitch((BPELSwitch) o);
		else if (o instanceof BPELWait)
			visitWait((BPELWait) o);
		else if (o instanceof BPELWhile)
			visitWhile((BPELWhile) o);
	}

	public abstract void visitProcess(BPELProcess process);

	public abstract void visitInvoke(BPELInvoke invoke);

	public abstract void visitSequence(BPELSequence sequence);

	public abstract void visitReceive(BPELReceive receive);

	public abstract void visitEmpty(BPELEmpty empty);

	public abstract void visitReply(BPELReply reply);

	public abstract void visitScope(BPELScope scope);

	public abstract void visitWhile(BPELWhile while1);

	public abstract void visitSwitch(BPELSwitch switch1);

	public abstract void visitFlow(BPELFlow flow);

	public abstract void visitPick(BPELPick pick);

	public abstract void visitAssign(BPELAssign assign);

	public abstract void visitWait(BPELWait wait);
}
