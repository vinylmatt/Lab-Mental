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
			"Main", new int[] {16,9,16,28},
			new GoalEvent('+',
				new Goal(
					new Predicate("main", new Term[] {
						new Variable(Type.LIST, "args",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"Main", new int[] {16,27,35,5},
				new Statement[] {
					new ModuleCall("console",
						"Main", new int[] {18,8,18,94},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("1 Start main loop After 2 seconds, switch s1 should be turned on...")
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
					),
					new ModuleCall("system",
						"Main", new int[] {20,8,20,25},
						new Predicate("sleep", new Term[] {
							Primitive.newPrimitive(2000)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.System) intention.getModule("Main","system")).sleep(
									(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new Subgoal(
						"Main", new int[] {22,8,35,5},
						new Goal(
							new Predicate("flip1", new Term[] {})
						)
					),
					new Subgoal(
						"Main", new int[] {23,8,35,5},
						new Goal(
							new Predicate("flip2", new Term[] {})
						)
					),
					new Subgoal(
						"Main", new int[] {24,8,35,5},
						new Goal(
							new Predicate("flip1", new Term[] {})
						)
					),
					new Subgoal(
						"Main", new int[] {25,8,35,5},
						new Goal(
							new Predicate("flip2", new Term[] {})
						)
					),
					new Subgoal(
						"Main", new int[] {26,8,35,5},
						new Goal(
							new Predicate("flip1", new Term[] {})
						)
					),
					new Subgoal(
						"Main", new int[] {27,8,35,5},
						new Goal(
							new Predicate("flip2", new Term[] {})
						)
					),
					new Subgoal(
						"Main", new int[] {28,8,35,5},
						new Goal(
							new Predicate("flip2", new Term[] {})
						)
					),
					new Subgoal(
						"Main", new int[] {29,8,35,5},
						new Goal(
							new Predicate("flip1", new Term[] {})
						)
					),
					new ModuleCall("system",
						"Main", new int[] {30,8,30,25},
						new Predicate("sleep", new Term[] {
							Primitive.newPrimitive(2000)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.System) intention.getModule("Main","system")).sleep(
									(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ModuleCall("system",
						"Main", new int[] {31,8,31,21},
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
					),
					new ModuleCall("console",
						"Main", new int[] {33,8,33,30},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("...")
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
		addRule(new Rule(
			"Main", new int[] {37,9,37,69},
			new GoalEvent('+',
				new Goal(
					new Predicate("flip1", new Term[] {})
				)
			),
			new AND(
				new Predicate("switch", new Term[] {
					Primitive.newPrimitive("1"),
					new Variable(Type.STRING, "S",false)
				}),
				new Predicate("transition", new Term[] {
					new Variable(Type.STRING, "S"),
					new Variable(Type.STRING, "T",false)
				})
			),
			new Block(
				"Main", new int[] {37,68,41,5},
				new Statement[] {
					new ModuleCall("console",
						"Main", new int[] {38,9,38,61},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("4a Goal Switch "),
								Operator.newOperator('+',
									new Variable(Type.STRING, "T"),
									Primitive.newPrimitive(" switch 1")
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
					),
					new BeliefUpdate('-',
						"Main", new int[] {39,8,41,5},
						new Predicate("switch", new Term[] {
							Primitive.newPrimitive("1"),
							new Variable(Type.STRING, "S")
						})
					),
					new BeliefUpdate('+',
						"Main", new int[] {40,8,41,5},
						new Predicate("switch", new Term[] {
							Primitive.newPrimitive("1"),
							new Variable(Type.STRING, "T")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Main", new int[] {43,9,43,69},
			new GoalEvent('+',
				new Goal(
					new Predicate("flip2", new Term[] {})
				)
			),
			new AND(
				new Predicate("switch", new Term[] {
					Primitive.newPrimitive("2"),
					new Variable(Type.STRING, "S",false)
				}),
				new Predicate("transition", new Term[] {
					new Variable(Type.STRING, "S"),
					new Variable(Type.STRING, "T",false)
				})
			),
			new Block(
				"Main", new int[] {43,68,47,5},
				new Statement[] {
					new ModuleCall("console",
						"Main", new int[] {44,9,44,56},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("4b Switch "),
								Operator.newOperator('+',
									new Variable(Type.STRING, "T"),
									Primitive.newPrimitive(" switch 2")
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
					),
					new BeliefUpdate('-',
						"Main", new int[] {45,8,47,5},
						new Predicate("switch", new Term[] {
							Primitive.newPrimitive("2"),
							new Variable(Type.STRING, "S")
						})
					),
					new BeliefUpdate('+',
						"Main", new int[] {46,8,47,5},
						new Predicate("switch", new Term[] {
							Primitive.newPrimitive("2"),
							new Variable(Type.STRING, "T")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Main", new int[] {49,9,49,38},
			new BeliefEvent('+',
				new Predicate("switch", new Term[] {
					new Variable(Type.STRING, "A",false),
					new Variable(Type.STRING, "S",false)
				})
			),
			Predicate.TRUE,
			new Block(
				"Main", new int[] {49,37,52,5},
				new Statement[] {
					new ModuleCall("console",
						"Main", new int[] {50,8,50,74},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("2. Set Goal light  "),
								Operator.newOperator('+',
									new Variable(Type.STRING, "A"),
									Operator.newOperator('+',
										Primitive.newPrimitive(" to state "),
										Operator.newOperator('+',
											new Variable(Type.STRING, "S"),
											Primitive.newPrimitive(" ")
										)
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
					),
					new Subgoal(
						"Main", new int[] {51,8,52,5},
						new Goal(
							new Predicate("light", new Term[] {
								new Variable(Type.STRING, "A"),
								new Variable(Type.STRING, "S")
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Main", new int[] {54,9,54,52},
			new GoalEvent('+',
				new Goal(
					new Predicate("light", new Term[] {
						new Variable(Type.STRING, "A",false),
						new Variable(Type.STRING, "S",false)
					})
				)
			),
			new Predicate("light", new Term[] {
				new Variable(Type.STRING, "A"),
				new Variable(Type.STRING, "S")
			}),
			new Block(
				"Main", new int[] {54,51,56,5},
				new Statement[] {
					new ModuleCall("console",
						"Main", new int[] {55,8,55,108},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("Light "),
								Operator.newOperator('+',
									new Variable(Type.STRING, "A"),
									Operator.newOperator('+',
										Primitive.newPrimitive(" already correct in state '"),
										Operator.newOperator('+',
											new Variable(Type.STRING, "S"),
											Primitive.newPrimitive("' matching switch, do nothing ")
										)
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
		addRule(new Rule(
			"Main", new int[] {59,9,59,78},
			new GoalEvent('+',
				new Goal(
					new Predicate("light", new Term[] {
						new Variable(Type.STRING, "A",false),
						new Variable(Type.STRING, "S",false)
					})
				)
			),
			new AND(
				new NOT(
					new Predicate("light", new Term[] {
						new Variable(Type.STRING, "A"),
						new Variable(Type.STRING, "S")
					})
				),
				new Predicate("transition", new Term[] {
					new Variable(Type.STRING, "T",false),
					new Variable(Type.STRING, "S")
				})
			),
			new Block(
				"Main", new int[] {59,77,72,5},
				new Statement[] {
					new ModuleCall("d",
						"Main", new int[] {60,8,60,23},
						new Predicate("dumpBeliefs", new Term[] {}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Debug) intention.getModule("Main","d")).dumpBeliefs(
								);
							}
						}
					),
					new ModuleCall("console",
						"Main", new int[] {61,8,61,103},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("Light "),
								Operator.newOperator('+',
									new Variable(Type.STRING, "A"),
									Operator.newOperator('+',
										Primitive.newPrimitive(" in wrong state "),
										Operator.newOperator('+',
											new Variable(Type.STRING, "T"),
											Operator.newOperator('+',
												Primitive.newPrimitive(" fix the light by changing it to "),
												new Variable(Type.STRING, "S")
											)
										)
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
					),
					new BeliefUpdate('-',
						"Main", new int[] {64,8,72,5},
						new Predicate("light", new Term[] {
							new Variable(Type.STRING, "A"),
							new Variable(Type.STRING, "T")
						})
					),
					new BeliefUpdate('+',
						"Main", new int[] {65,8,72,5},
						new Predicate("light", new Term[] {
							new Variable(Type.STRING, "A"),
							new Variable(Type.STRING, "S")
						})
					),
					new ModuleCall("console",
						"Main", new int[] {66,8,66,77},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("call "),
								Operator.newOperator('+',
									new Variable(Type.STRING, "A"),
									Operator.newOperator('+',
										Primitive.newPrimitive(" light to change to "),
										Operator.newOperator('+',
											new Variable(Type.STRING, "S"),
											Primitive.newPrimitive("  again... ")
										)
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
					),
					new ModuleCall("system",
						"Main", new int[] {67,8,67,25},
						new Predicate("sleep", new Term[] {
							Primitive.newPrimitive(2000)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.System) intention.getModule("Main","system")).sleep(
									(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ModuleCall("d",
						"Main", new int[] {68,8,68,23},
						new Predicate("dumpBeliefs", new Term[] {}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Debug) intention.getModule("Main","d")).dumpBeliefs(
								);
							}
						}
					),
					new Subgoal(
						"Main", new int[] {69,8,72,5},
						new Goal(
							new Predicate("light", new Term[] {
								new Variable(Type.STRING, "A"),
								new Variable(Type.STRING, "S")
							})
						)
					),
					new ModuleCall("d",
						"Main", new int[] {70,8,70,23},
						new Predicate("dumpBeliefs", new Term[] {}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Debug) intention.getModule("Main","d")).dumpBeliefs(
								);
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"Main", new int[] {74,9,74,38},
			new BeliefEvent('+',
				new Predicate("light", new Term[] {
					new Variable(Type.STRING, "L",false),
					new Variable(Type.STRING, "L2",false)
				})
			),
			Predicate.TRUE,
			new Block(
				"Main", new int[] {74,37,76,5},
				new Statement[] {
					new ModuleCall("console",
						"Main", new int[] {75,8,75,63},
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
				Primitive.newPrimitive("1"),
				Primitive.newPrimitive("off")
			})
		);
		agent.initialize(
			new Predicate("switch", new Term[] {
				Primitive.newPrimitive("2"),
				Primitive.newPrimitive("off")
			})
		);
		agent.initialize(
			new Predicate("light", new Term[] {
				Primitive.newPrimitive("1"),
				Primitive.newPrimitive("off")
			})
		);
		agent.initialize(
			new Predicate("light", new Term[] {
				Primitive.newPrimitive("2"),
				Primitive.newPrimitive("off")
			})
		);
		agent.initialize(
			new Predicate("transition", new Term[] {
				Primitive.newPrimitive("off"),
				Primitive.newPrimitive("on")
			})
		);
	}

	public Fragment createFragment(astra.core.Agent agent) throws ASTRAClassNotFoundException {
		Fragment fragment = new Fragment(this);
		fragment.addModule("console",astra.lang.Console.class,agent);
		fragment.addModule("system",astra.lang.System.class,agent);
		fragment.addModule("d",astra.lang.Debug.class,agent);
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
