/* Copyright 2014 Dominic Scheurer
 * 
 * This file is part of FSAUtils.
 * 
 * FSAUtils is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * FSAUtils is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *  
 * You should have received a copy of the GNU General Public License
 * along with FSAUtils. If not, see <http://www.gnu.org/licenses/>.
 */

package de.dominicscheurer.fsautils {
    import Types._
  
	object Helpers {
        
        def powerSet[A](s: Set[A]) = s.subsets.toSet
		
		def optJoin[A](a: Option[Set[A]], b: Option[Set[A]]): Option[Set[A]] =
			a match {
			  case Some(s1) => b match {
			    case Some(s2) => Some(s1 ++ s2)
			    case None => Some(s1)
			  }
			  case None => b match {
			    case Some(s) => Some(s)
			    case None => None
			  }
			}
		  
		def cartesianStateProduct(a: Set[State], b: Set[State]) : Set[State] =
	      cartesianProduct(a,b).map(p => pair(p._1, p._2))
	    
	    def cartesianProduct[A,B](a: Set[A], b: Set[B]) : Set[(A,B)] =
		  a.foldLeft(Set(): Set[(A,B)])(
	        (acc,elem) => acc ++ b.foldLeft(Set(): Set[(A,B)])(
	            (acc1,elem1) => acc1 + (elem -> elem1)
	        )
	    )
	}
}