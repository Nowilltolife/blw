package dev.xdark.blw.classfile.generic;

import dev.xdark.blw.annotation.Annotation;
import dev.xdark.blw.annotation.Element;
import dev.xdark.blw.classfile.Method;
import dev.xdark.blw.classfile.attribute.Parameter;
import dev.xdark.blw.code.Code;
import dev.xdark.blw.type.InstanceType;
import dev.xdark.blw.type.MethodType;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class GenericMethod extends GenericMember<MethodType> implements Method {
	protected final MethodType type;
	protected final Code code;
	protected final List<InstanceType> exceptionTypes;
	protected final List<Parameter> parameters;
	protected final Element annotationDefault;

	public GenericMethod(int accessFlags, String name, String signature, List<Annotation> visibleRuntimeAnnotations, List<Annotation> invisibleRuntimeAnnotations, MethodType type, Code code, List<InstanceType> exceptionTypes, List<Parameter> parameters, Element annotationDefault) {
		super(accessFlags, name, signature, visibleRuntimeAnnotations, invisibleRuntimeAnnotations);
		this.type = type;
		this.code = code;
		this.exceptionTypes = exceptionTypes;
		this.parameters = parameters;
		this.annotationDefault = annotationDefault;
	}

	@Override
	public @Nullable Code code() {
		return code;
	}

	@Override
	public MethodType type() {
		return type;
	}

	@Override
	public List<InstanceType> exceptionTypes() {
		return exceptionTypes;
	}

	@Override
	public List<Parameter> parameters() {
		return parameters;
	}

	@Override
	public @Nullable Element annotationDefault() {
		return annotationDefault;
	}
}
