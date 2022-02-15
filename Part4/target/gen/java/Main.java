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
			"Main", new int[] {25,9,25,31},
			new GoalEvent('+',
				new Goal(
					new Predicate("discoSequence", new Term[] {
						new ListTerm(new Term[] {

						})
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"Main", new int[] {25,30,42,5},
				new Statement[] {
					new ModuleCall("system",
						"Main", new int[] {27,8,27,25},
						new Predicate("sleep", new Term[] {
							Primitive.newPrimitive(1000)
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
						"Main", new int[] {28,8,42,5},
						new Goal(
							new Predicate("light", new Term[] {
								Primitive.newPrimitive("l2"),
								Primitive.newPrimitive("on")
							})
						)
					),
					new Subgoal(
						"Main", new int[] {29,8,42,5},
						new Goal(
							new Predicate("light", new Term[] {
								Primitive.newPrimitive("l1"),
								Primitive.newPrimitive("on")
							})
						)
					),
					new ModuleCall("system",
						"Main", new int[] {30,8,30,25},
						new Predicate("sleep", new Term[] {
							Primitive.newPrimitive(1000)
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
						"Main", new int[] {32,8,42,5},
						new Goal(
							new Predicate("light", new Term[] {
								Primitive.newPrimitive("l2"),
								Primitive.newPrimitive("on")
							})
						)
					),
					new Subgoal(
						"Main", new int[] {33,8,42,5},
						new Goal(
							new Predicate("light", new Term[] {
								Primitive.newPrimitive("l1"),
								Primitive.newPrimitive("on")
							})
						)
					),
					new ModuleCall("system",
						"Main", new int[] {34,8,34,25},
						new Predicate("sleep", new Term[] {
							Primitive.newPrimitive(1000)
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
						"Main", new int[] {36,8,42,5},
						new Goal(
							new Predicate("light", new Term[] {
								Primitive.newPrimitive("l2"),
								Primitive.newPrimitive("on")
							})
						)
					),
					new Subgoal(
						"Main", new int[] {37,8,42,5},
						new Goal(
							new Predicate("light", new Term[] {
								Primitive.newPrimitive("l1"),
								Primitive.newPrimitive("on")
							})
						)
					),
					new ModuleCall("system",
						"Main", new int[] {38,8,38,25},
						new Predicate("sleep", new Term[] {
							Primitive.newPrimitive(1000)
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
					new ModuleCall("console",
						"Main", new int[] {39,8,39,83},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("..............................whole behaviour repeated")
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
						"Main", new int[] {40,8,42,5},
						new Goal(
							new Predicate("discoLights", new Term[] {})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Main", new int[] {44,9,44,45},
			new GoalEvent('+',
				new Goal(
					new Predicate("discoSequence", new Term[] {
						new ListSplitter(
							new Variable(Type.LIST, "H",false),
							new Variable(Type.LIST, "T",false)
						)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"Main", new int[] {44,44,52,5},
				new Statement[] {
					new Subgoal(
						"Main", new int[] {47,8,52,5},
						new Goal(
							new Predicate("light", new Term[] {
								Primitive.newPrimitive("l1"),
								new ModuleTerm("P", Type.STRING,
									new Predicate("valueAsString", new Term[] {
										new Variable(Type.LIST, "H"),
										Primitive.newPrimitive(0)
									}),
									new ModuleTermAdaptor() {
										public Object invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.Prelude) intention.getModule("Main","P")).valueAsString(
												(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0)),
												(int) intention.evaluate(predicate.getTerm(1))
											);
										}
										public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
											return ((astra.lang.Prelude) visitor.agent().getModule("Main","P")).valueAsString(
												(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0)),
												(int) visitor.evaluate(predicate.getTerm(1))
											);
										}
									}
								)
							})
						)
					),
					new Subgoal(
						"Main", new int[] {48,8,52,5},
						new Goal(
							new Predicate("light", new Term[] {
								Primitive.newPrimitive("l2"),
								new ModuleTerm("P", Type.STRING,
									new Predicate("valueAsString", new Term[] {
										new Variable(Type.LIST, "H"),
										Primitive.newPrimitive(1)
									}),
									new ModuleTermAdaptor() {
										public Object invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.Prelude) intention.getModule("Main","P")).valueAsString(
												(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0)),
												(int) intention.evaluate(predicate.getTerm(1))
											);
										}
										public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
											return ((astra.lang.Prelude) visitor.agent().getModule("Main","P")).valueAsString(
												(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0)),
												(int) visitor.evaluate(predicate.getTerm(1))
											);
										}
									}
								)
							})
						)
					),
					new ModuleCall("system",
						"Main", new int[] {49,8,49,25},
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
						"Main", new int[] {51,8,52,5},
						new Goal(
							new Predicate("discoSequence", new Term[] {
								new Variable(Type.LIST, "T")
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Main", new int[] {54,9,54,55},
			new GoalEvent('+',
				new Goal(
					new Predicate("discoLights", new Term[] {})
				)
			),
			new Predicate("lightTransitions", new Term[] {
				new Variable(Type.LIST, "T",false)
			}),
			new Block(
				"Main", new int[] {54,54,59,5},
				new Statement[] {
					new Subgoal(
						"Main", new int[] {56,8,59,5},
						new Goal(
							new Predicate("discoSequence", new Term[] {
								new Variable(Type.LIST, "T")
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Main", new int[] {63,9,63,90},
			new GoalEvent('+',
				new Goal(
					new Predicate("light", new Term[] {
						new Variable(Type.STRING, "A",false),
						new Variable(Type.STRING, "S",false)
					})
				)
			),
			new AND(
				new Predicate("light", new Term[] {
					new Variable(Type.STRING, "A"),
					new Variable(Type.STRING, "S")
				}),
				new AND(
					new Predicate("light", new Term[] {
						Primitive.newPrimitive("l1"),
						Primitive.newPrimitive("on")
					}),
					new Predicate("light", new Term[] {
						Primitive.newPrimitive("l2"),
						Primitive.newPrimitive("on")
					})
				)
			),
			new Block(
				"Main", new int[] {63,89,86,5},
				new Statement[] {
					new ModuleCall("console",
						"Main", new int[] {66,8,66,41},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("----PARTY-----")
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
							Primitive.newPrimitive(1000)
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
					new SpecialBeliefUpdate(
						"Main", new int[] {68,8,86,5},
						new Predicate("light", new Term[] {
							Primitive.newPrimitive("l2"),
							Primitive.newPrimitive("off")
						})
					),
					new SpecialBeliefUpdate(
						"Main", new int[] {69,8,86,5},
						new Predicate("light", new Term[] {
							Primitive.newPrimitive("l1"),
							Primitive.newPrimitive("on")
						})
					),
					new ModuleCall("console",
						"Main", new int[] {70,8,70,41},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("----PARTY-----")
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
						"Main", new int[] {71,8,71,25},
						new Predicate("sleep", new Term[] {
							Primitive.newPrimitive(1000)
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
					new SpecialBeliefUpdate(
						"Main", new int[] {72,8,86,5},
						new Predicate("light", new Term[] {
							Primitive.newPrimitive("l1"),
							Primitive.newPrimitive("off")
						})
					),
					new SpecialBeliefUpdate(
						"Main", new int[] {73,8,86,5},
						new Predicate("light", new Term[] {
							Primitive.newPrimitive("l2"),
							Primitive.newPrimitive("on")
						})
					),
					new ModuleCall("console",
						"Main", new int[] {74,8,74,41},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("----PARTY-----")
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
						"Main", new int[] {75,8,75,25},
						new Predicate("sleep", new Term[] {
							Primitive.newPrimitive(1000)
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
					new SpecialBeliefUpdate(
						"Main", new int[] {76,8,86,5},
						new Predicate("light", new Term[] {
							Primitive.newPrimitive("l2"),
							Primitive.newPrimitive("on")
						})
					),
					new ModuleCall("console",
						"Main", new int[] {78,8,78,52},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("Light: l2 is in state: on")
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
					new SpecialBeliefUpdate(
						"Main", new int[] {79,8,86,5},
						new Predicate("light", new Term[] {
							Primitive.newPrimitive("l1"),
							Primitive.newPrimitive("on")
						})
					),
					new ModuleCall("console",
						"Main", new int[] {80,8,80,41},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("----PARTY-----")
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
						"Main", new int[] {81,8,81,25},
						new Predicate("sleep", new Term[] {
							Primitive.newPrimitive(1000)
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
					new SpecialBeliefUpdate(
						"Main", new int[] {82,8,86,5},
						new Predicate("light", new Term[] {
							Primitive.newPrimitive("l2"),
							Primitive.newPrimitive("off")
						})
					),
					new SpecialBeliefUpdate(
						"Main", new int[] {83,8,86,5},
						new Predicate("light", new Term[] {
							Primitive.newPrimitive("l1"),
							Primitive.newPrimitive("off")
						})
					),
					new ModuleCall("console",
						"Main", new int[] {84,8,84,41},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("----PARTY-----")
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
			"Main", new int[] {88,9,88,52},
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
				"Main", new int[] {88,51,91,5},
				new Statement[] {
				}
			)
		));
		addRule(new Rule(
			"Main", new int[] {94,9,94,78},
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
				"Main", new int[] {94,77,102,5},
				new Statement[] {
					new BeliefUpdate('-',
						"Main", new int[] {98,8,102,5},
						new Predicate("light", new Term[] {
							new Variable(Type.STRING, "A"),
							new Variable(Type.STRING, "T")
						})
					),
					new BeliefUpdate('+',
						"Main", new int[] {99,8,102,5},
						new Predicate("light", new Term[] {
							new Variable(Type.STRING, "A"),
							new Variable(Type.STRING, "S")
						})
					),
					new Subgoal(
						"Main", new int[] {100,8,102,5},
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
			"Main", new int[] {104,9,104,38},
			new BeliefEvent('+',
				new Predicate("light", new Term[] {
					new Variable(Type.STRING, "L",false),
					new Variable(Type.STRING, "L2",false)
				})
			),
			Predicate.TRUE,
			new Block(
				"Main", new int[] {104,37,106,5},
				new Statement[] {
					new ModuleCall("console",
						"Main", new int[] {105,8,105,63},
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
			new Predicate("transition", new Term[] {
				Primitive.newPrimitive("off"),
				Primitive.newPrimitive("on")
			})
		);
		agent.initialize(
			new Predicate("transition", new Term[] {
				Primitive.newPrimitive("on"),
				Primitive.newPrimitive("off")
			})
		);
		agent.initialize(
			new Predicate("lightTransitions", new Term[] {
				new ListTerm(new Term[] {
					new ListTerm(new Term[] {
						Primitive.newPrimitive("off"),
						Primitive.newPrimitive("off")
					}),
					new ListTerm(new Term[] {
						Primitive.newPrimitive("on"),
						Primitive.newPrimitive("off")
					}),
					new ListTerm(new Term[] {
						Primitive.newPrimitive("off"),
						Primitive.newPrimitive("on")
					}),
					new ListTerm(new Term[] {
						Primitive.newPrimitive("on"),
						Primitive.newPrimitive("on")
					})
				})
			})
		);
		agent.initialize(
			new Goal(
				new Predicate("discoLights", new Term[] {})
			)
		);
	}

	public Fragment createFragment(astra.core.Agent agent) throws ASTRAClassNotFoundException {
		Fragment fragment = new Fragment(this);
		fragment.addModule("console",astra.lang.Console.class,agent);
		fragment.addModule("P",astra.lang.Prelude.class,agent);
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
