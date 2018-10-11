/**
 * [Team.java]
 * Team object
 * @author Josh Cai
 */

public class Team implements Comparable<Team>{
	
	private int seed;
	private String name;
	
	/**
	 * Creates a new Team object with only a name. The seed is set to 0.
	 * 
	 * @param name name of the team
	 */
	Team(String name){
		this.name = name;
		this.seed = 0;
	}
	
	/**
	 * Creates a new Team object with both name and seed.
	 * 
	 * @param name name of the team
	 * @param seed seed of the team
	 */
	Team(String name, int seed){
		this.name = name;
		this.seed = seed;
	}
	
	/**
	 * Returns the seed of the team
	 * 
	 * @return the seed of the team
	 */
	public int getSeed(){
		return this.seed;
	}
	
	/**
	 * Returns the name of the team
	 * 
	 * @return the name of the team
	 */
	public String getName(){
		return this.name;
	}
	
	/**
	 * Compares the seeds of two teams
	 * 
	 * @param other the team to be compared to
	 * @return the value 0 if both seeds are equal; a value less than 0 if first team seed < second team seed; and a value greater than 0 if first team seed > second team seed
	 */
	public int compareTo(Team other){
		return Integer.compare(getSeed(), other.getSeed());
	}
}
