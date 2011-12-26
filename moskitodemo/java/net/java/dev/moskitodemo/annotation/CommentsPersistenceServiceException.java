/**
 ***************************************************************************************
 *** ICommentsPersistenceService.java                                                ***
 *** Generator: net.anotheria.asg.generator.model.db.JDBCPersistenceServiceGenerator ***
 *** generated by AnoSiteGenerator (ASG), Version: 1.3.3                             ***
 *** Copyright (C) 2005 - 2010 Anotheria.net, www.anotheria.net                      ***
 *** All Rights Reserved.                                                            ***
 ***************************************************************************************
 *** Don't edit this code, if you aren't sure                                        ***
 *** that you do exactly know what you are doing!                                    ***
 *** It's better to invest time in the generator, as into the generated code.        ***
 ***************************************************************************************
 */

package net.java.dev.moskitodemo.annotation;

import net.anotheria.db.dao.DAOException;

import java.sql.SQLException;

public class CommentsPersistenceServiceException extends Exception{

	public CommentsPersistenceServiceException(String message){
		super(message);
	}
	public CommentsPersistenceServiceException(SQLException e){
		super("Undelying DB Error: "+e.getMessage());
	}
	public CommentsPersistenceServiceException(DAOException e){
		super("Undelying DAO Error: "+e.getMessage());
	}
}