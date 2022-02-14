/**
 * GENERATED CODE - DO NOT CHANGE
 */

import astra.core.*;
import astra.execution.*;
import astra.event.*;
import astra.messaging.*;
import astra.formula.*;
import astra.lang.*;
import astra.statement.*;
import astra.term.*;
import astra.type.*;
import astra.tr.*;
import astra.reasoner.util.*;


public class Main extends ASTRAClass {
	public Main() {
		setParents(new Class[] {astra.lang.Agent.class});
		addRule(new Rule(
			"Main", new int[] {13,9,13,49},
			new BeliefEvent('+',
				new Predicate("switch", new Term[] {
					Primitive.newPrimitive("s1"),
					Primitive.newPrimitive("on")
				})
			),
			new Predicate("light", new Term[] {
				Primitive.newPrimitive("l1"),
				Primitive.newPrimitive("off")
			}),
			new Block(
				"Main", new int[] {13,48,17,5},
				new Statement[] {
					new BeliefUpdate('-',
						"Main", new int[] {14,8,17,5},
						new Predicate("light", new Term[] {
							Primitive.newPrimitive("l1"),
							Primitive.newPrimitive("off")
						})
					),
					new BeliefUpdate('+',
						"Main", new int[] {15,8,17,5},
						new Predicate("light", new Term[] {
							Primitive.newPrimitive("l1"),
							Primitive.newPrimitive("on")
						})
					),
					new ModuleCall("system",
						"Main", new int[] {16,8,16,21},
						new Predicate("exit", new Term[] {}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.System) intention.getModule("Main","system")).exit(
								);
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"Main", new int[] {19,9,19,38},
			new BeliefEvent('+',
				new Predicate("light", new Term[] {
					new Variable(Type.STRING, "L",false),
					new Variable(Type.STRING, "L2",false)
				})
			),
			Predicate.TRUE,
			new Block(
				"Main", new int[] {19,37,22,5},
				new Statement[] {
					new ModuleCall("console",
						"Main", new int[] {20,8,20,63},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("Light: "),
								Operator.newOperator('+',
									new Variable(Type.STRING, "L"),
									Operator.newOperator('+',
										Primitive.newPrimitive(" is in state: "),
										new Variable(Type.STRING, "L2")
									)
								)
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Main","console")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					)
				}
			)
		));
	}

	public void initialize(astra.core.Agent agent) {
		agent.initialize(
			new Predicate("switch", new Term[] {
				Primitive.newPrimitive("s1"),
				Primitive.newPrimitive("on")
			})
		);
		agent.initialize(
			new Predicate("light", new Term[] {
				Primitive.newPrimitive("l1"),
				Primitive.newPrimitive("off")
			})
		);
	}

	public Fragment createFragment(astra.core.Agent agent) throws ASTRAClassNotFoundException {
		Fragment fragment = new Fragment(this);
		fragment.addModule("console",astra.lang.Console.class,agent);
		fragment.addModule("system",astra.lang.System.class,agent);
		return fragment;
	}

	public static void main(String[] args) {
		Scheduler.setStrategy(new TestSchedulerStrategy());
		ListTerm argList = new ListTerm();
		for (String arg: args) {
			argList.add(Primitive.newPrimitive(arg));
		}

		String name = java.lang.System.getProperty("astra.name", "main");
		try {
			astra.core.Agent agent = new Main().newInstance(name);
			agent.initialize(new Goal(new Predicate("main", new Term[] { argList })));
			Scheduler.schedule(agent);
		} catch (AgentCreationException e) {
			e.printStackTrace();
		} catch (ASTRAClassNotFoundException e) {
			e.printStackTrace();
		};
	}
}
