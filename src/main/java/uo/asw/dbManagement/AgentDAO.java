package uo.asw.dbManagement;

import uo.asw.dbManagement.model.Agent;

/**
 * @since 0.0.1
 */
public interface AgentDAO {
    Agent getAgent(String login, String password);
    Agent updateInfo(Agent toUpdate);
}